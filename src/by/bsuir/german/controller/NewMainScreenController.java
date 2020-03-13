package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.Adornment;
import by.bsuir.german.entity.AdornmentExtended;
import by.bsuir.german.service.IO;
import by.bsuir.german.service.Logic;
import by.bsuir.german.service.Serialization;
import by.bsuir.german.service.Storage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class NewMainScreenController {

    private List<Adornment> adornmentList = new ArrayList<>();
    private IO io;
    private Storage storage;
    private Logic logic;
    private MainFX mainFX;
    private Serialization serialization;

    private ObservableList<AdornmentExtended> adornmentExtendedList;

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


    private void showScene(Parent root, ActionEvent event) {
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    void ItemAddMetal(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingMetal.fxml"));
        showScene(root, event);
    }

    @FXML
    void ItemAddStone(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingStone.fxml"));
        showScene(root, event);
    }

    @FXML
    void ItemCreateAdornment(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateAdornment.fxml"));
        showScene(root, event);
    }

    @FXML
    void ItemCreateEarring(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateEarringBase.fxml"));
        showScene(root, event);
    }

    @FXML
    void ItemCreateNecklace(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateNecklaceBase.fxml"));
        showScene(root, event);
    }

    @FXML
    void ItemCreateRing(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateRingBase.fxml"));
        showScene(root, event);
    }

    @FXML
    void goToStorage(ActionEvent event) throws IOException {
        root.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/StorageContentController.fxml"));
        showScene(root, event);
    }

    @FXML
    void openFile(ActionEvent event) {

    }

    @FXML
    void printAdornment(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

    @FXML
    void uploadFile(ActionEvent event) {

    }

    @FXML
    void initialize() {
        mainFX = new MainFX();
        initializateVariables();

        storage.fillAdornmentObservableList();

        adornmentExtendedList = storage.getAdornmentExtendedList();
        idTitle.setCellValueFactory(new PropertyValueFactory<AdornmentExtended, String>("title"));
        idType.setCellValueFactory(new PropertyValueFactory<AdornmentExtended, String>("type"));
        idPrice.setCellValueFactory(new PropertyValueFactory<AdornmentExtended, Double>("price"));
        idWeight.setCellValueFactory(new PropertyValueFactory<AdornmentExtended, Double>("weight"));
        idBaseTitle.setCellValueFactory(new PropertyValueFactory<AdornmentExtended, String>("baseTitle"));
        idUsedStones.setCellValueFactory(new PropertyValueFactory<AdornmentExtended, String>("usedStones"));

        tableAdornments.setItems(adornmentExtendedList);
    }

    private void initializateVariables() {
        storage = mainFX.getStorage();
        logic = mainFX.getLogic();
        io = mainFX.getIO();
        serialization = mainFX.getSerialization();
    }
}
