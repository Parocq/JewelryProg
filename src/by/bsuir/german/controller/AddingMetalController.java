package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.Metal;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddingMetalController {

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
    private TextField sampleField;

    @FXML
    private Button addMetal;

    @FXML
    private Button back;

    @FXML
    void addMetal(ActionEvent event) {
        String title = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        double weight = Double.parseDouble(weightField.getText());
        double sample = Double.parseDouble(sampleField.getText());

        Metal metal = new Metal(title,weight,price,sample);
        storage.addMetalOnStock(metal);
//        System.out.println(storage.getTitles(storage.getMetals()));
    }

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
//            FXMLLoader loader = new FXMLLoader(AddingMetalController.class.getResource("AddingMetal.fxml"));
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AddingMetal.fxml"));
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
    }
}