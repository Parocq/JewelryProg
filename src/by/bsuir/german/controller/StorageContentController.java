package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StorageContentController {

    private Storage storage;

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
    void backToMenu(ActionEvent event) throws IOException {
        update.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/MainMenu.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    void update(ActionEvent event) {
        setLists();
    }

    @FXML
    void initialize() {
        MainFX mainFX = new MainFX();
        storage = mainFX.getStorage();
        setLists();
    }

    private void setLists (){
        stonesList.setText(storage.getTitles(storage.getStones()));
        metalsList.setText(storage.getTitles(storage.getMetals()));
        earringBasesList.setText(storage.getTitles(storage.getEarringBases()));
        necklaceBasesList.setText(storage.getTitles(storage.getNecklaceBases()));
        ringBasesList.setText(storage.getTitles(storage.getRingBases()));
        adornmentList.setText(storage.getTitles(storage.getAdornments()));
    }
}
