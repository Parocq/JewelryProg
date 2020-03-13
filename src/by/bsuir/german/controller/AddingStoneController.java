package by.bsuir.german.controller;

//import com.gluonhq.charm.glisten.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.Metal;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddingStoneController {

    private Storage storage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private RadioButton isPrecious;

    @FXML
    private RadioButton isHalfPrecious;

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField colorField;

    @FXML
    private TextField weightField;

    @FXML
    private TextField transparenceField;

    @FXML
    private Button addStone;

    @FXML
    private Button back;

    @FXML
    void addStone(ActionEvent event) throws InputMismatchException {
        if (isPrecious.isSelected() || isHalfPrecious.isSelected()) {
            try {
                String title = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                double weight = Double.parseDouble(weightField.getText());
                double transparence = Double.parseDouble(transparenceField.getText());
                String color = colorField.getText();
                checkValues(weight, price, transparence);

                boolean type = isPrecious.isSelected();
                if (type) isHalfPrecious.setSelected(false);

                Stone stone = new Stone(title, weight, price, color, type, transparence);
                storage.addStoneOnStock(stone);
            } catch (InvalidFieldValueException e) {
                System.out.println("Ошибка вводимых значений!");
            } catch (NumberFormatException ex) {
                System.out.println("Ошибка форматов! / Не введены все значения!");
            }
        } else System.out.println("Необходимо отметить хотя бы 1 checkbox");
    }

    private void checkValues(double weight, double price, double transparence) throws InvalidFieldValueException {
        if (weight <= 0 || price < 0) {
            throw new InvalidFieldValueException();
        }
        if (transparence < 0 || transparence > 100) {
            throw new InvalidFieldValueException();
        }
    }

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        addStone.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/NewMainScreen.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void initialize() {
        MainFX mainFX = new MainFX();
        storage = mainFX.getStorage();
    }
}
