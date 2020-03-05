package by.bsuir.german.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddingMetalController {

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
    private TextField colorField;

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

    }

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert priceField != null : "fx:id=\"priceField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert colorField != null : "fx:id=\"colorField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert weightField != null : "fx:id=\"weightField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert sampleField != null : "fx:id=\"sampleField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert addMetal != null : "fx:id=\"addMetal\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'AddingMetal.fxml'.";

    }
}
