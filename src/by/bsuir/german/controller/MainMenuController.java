package by.bsuir.german.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private Button addStone;

    @FXML
    void initialize() {
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert addStone != null : "fx:id=\"addStone\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }
}
