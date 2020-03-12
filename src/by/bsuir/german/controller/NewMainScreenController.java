package by.bsuir.german.controller;

import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.entity.Adornment;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class NewMainScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private TableColumn<?, ?> idTitle;

    @FXML
    private TableColumn<?, ?> idType;

    @FXML
    private TableColumn<?, ?> idPrice;

    @FXML
    private TableColumn<?, ?> idWeight;

    @FXML
    private TableColumn<?, ?> idBaseTitle;

    @FXML
    private TableColumn<?, ?> idUsedStones;

    @FXML
    void initialize() {
//        idTitle.setCellValueFactory(new PropertyValueFactory<Adornment,String>("title"));
    }
}
