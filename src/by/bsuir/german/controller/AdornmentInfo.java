package by.bsuir.german.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import by.bsuir.german.MainFX;
import by.bsuir.german.entity.Adornment;
import by.bsuir.german.service.Logic;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdornmentInfo {

    private Storage storage;
    private Logic logic;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane root;

    @FXML
    private Button getInfo;

    @FXML
    private Button back;

    @FXML
    private TextArea adornmentsList;

    @FXML
    private TextField choosenAdornment;

    @FXML
    private Label adornmentTitle;

    @FXML
    private Label adornmentPrice;

    @FXML
    private Label adornmentWeight;

    @FXML
    private TextArea usedStonesList;

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        back.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/NewMainScreen.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    void getInfo(ActionEvent event) {
        int choosenAd = Integer.parseInt(choosenAdornment.getText())-1;
        Adornment adornment = storage.getAdornments().get(choosenAd);
        adornmentTitle.setText(adornment.getTitle());
        adornmentPrice.setText(Double.toString(logic.calculatePrice(choosenAd)));
        adornmentWeight.setText(Double.toString(logic.calculateWeight(choosenAd)));
        usedStonesList.setText(storage.getTitles(storage.getAdornments().get(choosenAd).getUsedStones()));
    }

    @FXML
    void initialize() {
        MainFX mainFX = new MainFX();
        storage = mainFX.getStorage();
        logic = mainFX.getLogic();
        adornmentsList.setText(storage.getTitles(storage.getAdornments()));
    }
}
