package by.bsuir.german.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateRingBaseController {

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
    private Button addRingBase;

    @FXML
    private Button back;

    @FXML
    private TextArea metalListField;

    @FXML
    private TextField choosenMetal;

    @FXML
    private TextField diametrField;

    @FXML
    void AddRingBase(ActionEvent event) {

    }

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert priceField != null : "fx:id=\"priceField\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert weightField != null : "fx:id=\"weightField\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert addRingBase != null : "fx:id=\"addRingBase\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert metalListField != null : "fx:id=\"metalListField\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert choosenMetal != null : "fx:id=\"choosenMetal\" was not injected: check your FXML file 'CreateRingBase.fxml'.";
        assert diametrField != null : "fx:id=\"diametrField\" was not injected: check your FXML file 'CreateRingBase.fxml'.";

    }
}