package by.bsuir.german.controller;

//import com.gluonhq.charm.glisten.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddingStoneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private RadioButton isPrecious;

    @FXML
    private RadioButton isHalfPrecious;

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField colorField;

    @FXML
    private TextField weightField;

    @FXML
    private TextField transparenceField;

    @FXML
    private Button addStone;

    @FXML
    private Button back;

    @FXML
    void addStone(ActionEvent event) {

    }

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert isPrecious != null : "fx:id=\"isPrecious\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert isHalfPrecious != null : "fx:id=\"isHalfPrecious\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert priceField != null : "fx:id=\"priceField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert colorField != null : "fx:id=\"colorField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert weightField != null : "fx:id=\"weightField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert transparenceField != null : "fx:id=\"transparenceField\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert addStone != null : "fx:id=\"addStone\" was not injected: check your FXML file 'AddingMetal.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'AddingMetal.fxml'.";

    }
}