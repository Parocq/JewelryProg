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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private Button workWithStorage;

    @FXML
    private Button getAdornmentInfo;

    @FXML
    private Button printAdornmentTitles;

    @FXML
    private Button serializeStorage;

    @FXML
    private Button deserializeStorage;

    @FXML
    void addMetal(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingMetal.fxml"));
        showScene(root,event);
    }

    @FXML
    void addStone(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingStone.fxml"));
        showScene(root,event);
    }

    @FXML
    void checkStorage(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/StorageContent.fxml"));
        showScene(root,event);
    }

    @FXML
    void createAdornment(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateAdornment.fxml"));
        showScene(root,event);
    }

    @FXML
    void createEarringBase(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateEarringBase.fxml"));
        showScene(root,event);
    }

    @FXML
    void createNecklaceBase(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateNecklaceBase.fxml"));
        showScene(root,event);
    }

    @FXML
    void createRingBase(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateRingBase.fxml"));
        showScene(root,event);
    }

    @FXML
    void deserializeStorage(ActionEvent event) {

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
    void workWithStorage(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }


    private void showScene (Parent root, ActionEvent event){
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
