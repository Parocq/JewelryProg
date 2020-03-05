package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
    private Button addMetal;

    @FXML
    private Button createRingBase;

    @FXML
    private Button createNecklaceBase;

    @FXML
    private Button createEarringBase;

    @FXML
    private Button createAdornment;

    @FXML
    private Button checkStorage;

    @FXML
    private Button sortStorage;

    @FXML
    private Button getAdornmentInfo;

    @FXML
    private Button findStones;

    @FXML
    private Button printAdornmentTitles;

    @FXML
    private Button serializeStorage;

    @FXML
    private Button deserializeStorage;

    @FXML
    void addMetal(ActionEvent event) {
        try {
            addMetal.getScene().getWindow().hide();
//            FXMLLoader loader = new FXMLLoader(AddingMetalController.class.getResource("AddingMetal.fxml"));
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AddingMetal.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("FXML/AddingMetal.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();
////            Parent root = (Parent) loader.load();
//            Stage stage = new Stage();
//
//            stage.initModality(Modality.APPLICATION_MODAL);
////            stage.initStyle(StageStyle.UNDECORATED);
////            stage.setTitle("ABC");
//            stage.setScene(new Scene(root));
//            stage.show();

//            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
//            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void addStone(ActionEvent event) {

    }

    @FXML
    void checkStorage(ActionEvent event) {

    }

    @FXML
    void createAdornment(ActionEvent event) {

    }

    @FXML
    void createEarringBase(ActionEvent event) {

    }

    @FXML
    void createNecklaceBase(ActionEvent event) {

    }

    @FXML
    void createRingBase(ActionEvent event) {

    }

    @FXML
    void deserializeStorage(ActionEvent event) {

    }

    @FXML
    void findStones(ActionEvent event) {

    }

    @FXML
    void getAdornmentInfo(ActionEvent event) {

    }

    @FXML
    void printAdornmentTitles(ActionEvent event) {

    }

    @FXML
    void serializeStorage(ActionEvent event) {

    }

    @FXML
    void sortStorage(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert addStone != null : "fx:id=\"addStone\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert addMetal != null : "fx:id=\"addMetal\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert createRingBase != null : "fx:id=\"createRingBase\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert createNecklaceBase != null : "fx:id=\"createNecklaceBase\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert createEarringBase != null : "fx:id=\"createEarringBase\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert createAdornment != null : "fx:id=\"createAdornment\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert checkStorage != null : "fx:id=\"checkStorage\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert sortStorage != null : "fx:id=\"sortStorage\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert getAdornmentInfo != null : "fx:id=\"getAdornmentInfo\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert findStones != null : "fx:id=\"findStones\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert printAdornmentTitles != null : "fx:id=\"printAdornmentTitles\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert serializeStorage != null : "fx:id=\"serializeStorage\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert deserializeStorage != null : "fx:id=\"deserializeStorage\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }
}
