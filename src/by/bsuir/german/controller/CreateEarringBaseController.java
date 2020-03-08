package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.EarringBase;
import by.bsuir.german.entity.Metal;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CreateEarringBaseController {

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
    private TextField priceField;

    @FXML
    private TextField weightField;

    @FXML
    private Button addEarringBase;

    @FXML
    private Button back;

    @FXML
    private TextArea metalListField;

    @FXML
    private TextField choosenMetal;

    @FXML
    private CheckBox isPair;

    @FXML
    void AddEarringBase(ActionEvent event) throws NumberFormatException {
        String title = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        double weight = Double.parseDouble(weightField.getText());
        boolean paired = isPair.isSelected();
        int metallNum = Integer.parseInt(choosenMetal.getText()) -1;
        try {
            checkValues(price,weight,metallNum);
        } catch (InvalidFieldValueException e) {
            System.out.println("Ошибка вводимых значений!");
        }
        Metal metal = storage.getMetals().get(metallNum);

        EarringBase earringBase = new EarringBase(title,weight,price,metal,paired);
        storage.addEarringBaseOnStock(earringBase);
    }

    private void checkValues(double price,double weight,int metal) throws InvalidFieldValueException {
        if (weight <= 0 || price < 0){
            throw new InvalidFieldValueException();
        }
        if (metal>storage.getMetals().size()-1 || metal<0){
            throw new InvalidFieldValueException();
        }
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
    void initialize() {
        MainFX mainFX = new MainFX();
        storage = mainFX.getStorage();
        metalListField.setText(storage.getTitles(storage.getMetals()));
    }
}
