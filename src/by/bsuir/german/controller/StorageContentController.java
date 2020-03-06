package by.bsuir.german.controller;

import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class StorageContentController {

    Storage storage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private Button back;

    @FXML
    private TextArea stonesList;

    @FXML
    private TextArea metalsList;

    @FXML
    private TextArea earringBasesList;

    @FXML
    private TextArea necklaceBasesList;

    @FXML
    private TextArea ringBasesList;

    @FXML
    private TextArea adornmentList;

    @FXML
    private Button update;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {
        String s = storage.getTitles(storage.getMetals());
        metalsList.setText("wefgwegewg");
    }

    @FXML
    void initialize() {
        MainFX mainFX = new MainFX();
        storage = mainFX.getStorage();
    }
}
