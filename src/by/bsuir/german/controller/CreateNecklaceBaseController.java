package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.EarringBase;
import by.bsuir.german.entity.Metal;
import by.bsuir.german.entity.NecklaceBase;
import by.bsuir.german.entity.Stone;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CreateNecklaceBaseController {

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
    private Button addNecklaceBase;

    @FXML
    private Button back;

    @FXML
    private TextArea metalListField;

    @FXML
    private TextField choosenMetal;

    @FXML
    private TextField lengthField;

    @FXML
    void addNecklaceBase(ActionEvent event) {
        try {
            String title = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double length = Double.parseDouble(lengthField.getText());
            int metallNum = Integer.parseInt(choosenMetal.getText()) - 1;
            checkValues(price, weight, length, metallNum);

            Metal metal = storage.getMetals().get(metallNum);
            NecklaceBase necklaceBase = new NecklaceBase(title, weight, price, metal, length);
            storage.addNecklaceBaseOnStock(necklaceBase);
        } catch (InvalidFieldValueException e) {
            System.out.println("Ошибка вводимых значений!");
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка форматов! / Не введены все значения!");
        }
    }

    private void checkValues(double price, double weight, double length, int metal) throws InvalidFieldValueException {
        if (weight <= 0 || price < 0 || length <= 0) {
            throw new InvalidFieldValueException();
        }
        if (metal > storage.getMetals().size() - 1 || metal < 0) {
            throw new InvalidFieldValueException();
        }
    }

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        back.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/MainMenu.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

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
