package by.bsuir.german.controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.*;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CreateAdornmentController {

    private Storage storage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField nameField;

    @FXML
    private Button addEarringBase;

    @FXML
    private Button back;

    @FXML
    private TextArea stonesListField;

    @FXML
    private TextArea choosedStones;

    @FXML
    private Button getVariants;

    @FXML
    private RadioButton isRing;

    @FXML
    private RadioButton isNecklace;

    @FXML
    private RadioButton isEarring;

    @FXML
    private TextArea basesList;

    @FXML
    private TextField choosedBase;

    @FXML
    void AddEarringBase(ActionEvent event) {
        String title = nameField.getText();
        List<Stone> stonesToUse = new ArrayList<>();
        try {
            stonesToUse = getStonesToUse(prepareString(addDot(choosedStones.getText())));
        } catch (InvalidFieldValueException e) {
            System.out.println("Ошибка вводимых значений!");
        }
        switch (getType()){
            case 1:
                RingBase base = storage.getRingBases().get(Integer.parseInt(choosedBase.getText())-1);
                Adornment adornment = new Adornment(title, base, stonesToUse);
                storage.addAdornmentOnStock(adornment);
                break;
            case 2:
                EarringBase base1 = storage.getEarringBases().get(Integer.parseInt(choosedBase.getText())-1);
                Adornment adornment1 = new Adornment(title, base1, stonesToUse);
                storage.addAdornmentOnStock(adornment1);
                break;
            case 3:
                NecklaceBase base2 = storage.getNecklaceBases().get(Integer.parseInt(choosedBase.getText())-1);
                Adornment adornment2 = new Adornment(title, base2, stonesToUse);
                storage.addAdornmentOnStock(adornment2);
                break;
            default:break;
        }
    }

    private String addDot(String s){
        return ","+s+",";
    }

    private List<Integer> prepareString (String s){
        List<Integer> numbers = new ArrayList<>();
        int start=0;
        int end=0;

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == ','){
                start = i;
                for (int j=start+1;j<s.length();j++){
                    if (s.charAt(j) == ','){
                        end = j;
                        String sub =  s.substring(start+1,end);
                        numbers.add((Integer.parseInt(sub)));
                        i = end-1;
                        break;
                    }
                }
            }
        }
        return numbers;
    }

    private void checkValues(List<Integer> list) throws InvalidFieldValueException {
        for (Integer i: list){
            if (i>=list.size() || i<=0){
                throw new InvalidFieldValueException();
            }
        }
    }

    private List<Stone> getStonesToUse (List<Integer> numbers) throws InvalidFieldValueException {
        checkValues(numbers);
        List<Stone> stonesToUse = new ArrayList<>();
        for (Integer i: numbers){
            stonesToUse.add(storage.getStones().get(i-1));
        }
        return stonesToUse;
    }

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        back.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/MainMenu.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void getVariants(ActionEvent event) {
        switch (getType()){
            case 1:
                basesList.setText(storage.getTitles(storage.getRingBases()));
            break;
            case 2:
                basesList.setText(storage.getTitles(storage.getEarringBases()));
            break;
            case 3:
                basesList.setText(storage.getTitles(storage.getNecklaceBases()));
            break;
            default: break;
        }
    }

    @FXML
    void initialize() {
        MainFX mainFX = new MainFX();
        storage = mainFX.getStorage();
        stonesListField.setText(storage.getTitles(storage.getStones()));
    }

    private int getType (){
        if (isRing.isSelected()){isEarring.setSelected(false); isNecklace.setSelected(false); return 1;}
        else if (isEarring.isSelected()){isRing.setSelected(false); isNecklace.setSelected(false); return 2;}
        else if (isNecklace.isSelected()){isEarring.setSelected(false); isRing.setSelected(false); return 3;}
        return 0;
    }
}
