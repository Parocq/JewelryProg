package by.bsuir.german.controller;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.AdornmentExtended;
import by.bsuir.german.service.IO;
import by.bsuir.german.service.Logic;
import by.bsuir.german.service.Serialization;
import by.bsuir.german.service.Storage;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class NewMainScreenController {

    private IO io;
    private Storage storage;
    private Logic logic;
    private MainFX mainFX;
    private Serialization serialization;

    private ObservableList<AdornmentExtended> adornmentExtendedList;

    @FXML
    private Label banner;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<AdornmentExtended> tableAdornments;

    @FXML
    private TableColumn<AdornmentExtended, String> idTitle;

    @FXML
    private TableColumn<AdornmentExtended, String> idType;

    @FXML
    private TableColumn<AdornmentExtended, Double> idPrice;

    @FXML
    private TableColumn<AdornmentExtended, Double> idWeight;

    @FXML
    private TableColumn<AdornmentExtended, String> idBaseTitle;

    @FXML
    private TableColumn<AdornmentExtended, String> idUsedStones;

    @FXML
    private MenuItem ItemAddStone;

    @FXML
    private MenuItem ItemAddMetal;

    @FXML
    private MenuItem ItemCreateRing;

    @FXML
    private MenuItem ItemCreateEarring;

    @FXML
    private MenuItem ItemCreateNecklace;

    @FXML
    private MenuItem ItemCreateAdornment;

    @FXML
    private MenuItem goToStorage;

    @FXML
    private MenuItem update;

    @FXML
    private MenuItem openFile;

    @FXML
    private MenuItem uploadFile;

    @FXML
    private MenuItem printAdornment;

    @FXML
    void ItemAddMetal(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingMetal.fxml"));
        setScene( "/by/bsuir/german/FXML/AddingMetal.fxml");
    }

    @FXML
    void ItemAddStone(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingStone.fxml"));
        setScene("/by/bsuir/german/FXML/AddingStone.fxml");
    }

    @FXML
    void ItemCreateAdornment(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateAdornment.fxml"));
        setScene( "/by/bsuir/german/FXML/CreateAdornment.fxml");
    }

    @FXML
    void ItemCreateEarring(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateEarringBase.fxml"));
        setScene("/by/bsuir/german/FXML/CreateEarringBase.fxml");
    }

    @FXML
    void ItemCreateNecklace(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateNecklaceBase.fxml"));
        setScene("/by/bsuir/german/FXML/CreateNecklaceBase.fxml");
    }

    @FXML
    void ItemCreateRing(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateRingBase.fxml"));
        setScene("/by/bsuir/german/FXML/CreateRingBase.fxml");
    }

    @FXML
    void goToStorage(ActionEvent event) throws IOException {
        banner.getScene().getWindow().hide();
//        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/StorageContent.fxml"));
        setScene("/by/bsuir/german/FXML/StorageContent.fxml");
    }

    @FXML
    void openFile(ActionEvent event) {

    }

    @FXML
    void printAdornment(ActionEvent event) {

    }


    @FXML
    void uploadFile(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {
        setTableValues();
    }

    public void setTableValues (){
        tableAdornments.getItems().clear();
        storage.fillAdornmentObservableList();

        adornmentExtendedList = storage.getAdornmentExtendedList();
        idTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        idType.setCellValueFactory(new PropertyValueFactory<>("type"));
        idPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        idWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        idBaseTitle.setCellValueFactory(new PropertyValueFactory<>("baseTitle"));
        idUsedStones.setCellValueFactory(new PropertyValueFactory<>("usedStones"));

        tableAdornments.setItems(adornmentExtendedList);
        idTitle.getColumns().clear();
    }

    @FXML
    void initialize() {
        mainFX = new MainFX();
        initializateVariables();

//        setTableValues();
    }

    private void initializateVariables() {
        storage = mainFX.getStorage();
        logic = mainFX.getLogic();
        io = mainFX.getIO();
        serialization = mainFX.getSerialization();
    }

    private void setScene(String fileLocation) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(fileLocation));
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root2 = fxmlLoader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root2));
        stage.show();
    }
}
