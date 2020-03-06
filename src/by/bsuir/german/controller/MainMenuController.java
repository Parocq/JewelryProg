package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.service.Storage;
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
            Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingMetal.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();
////            Parent root = (Parent) loader.load();
////            Stage stage = new Stage();
////
////            stage.initModality(Modality.APPLICATION_MODAL);
//////            stage.initStyle(StageStyle.UNDECORATED);
//////            stage.setTitle("ABC");
////            stage.setScene(new Scene(root));
////            stage.show();
//
////            Stage stage = new Stage();
////            stage.setScene(new Scene(root));
////            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void addStone(ActionEvent event) {

    }

    @FXML
    void checkStorage(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
//            FXMLLoader loader = new FXMLLoader(AddingMetalController.class.getResource("AddingMetal.fxml"));
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AddingMetal.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/StorageContent.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
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
    }
}
