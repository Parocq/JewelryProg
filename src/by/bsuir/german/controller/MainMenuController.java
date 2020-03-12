package by.bsuir.german.controller;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import by.bsuir.german.MainFX;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.IO;
import by.bsuir.german.service.Logic;
import by.bsuir.german.service.Serialization;
import by.bsuir.german.service.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenuController {

    private Logic logic;
    private Storage storage;
    private IO io;
    private Serialization serialization;
    private MainFX mainFX;

//    private static FileOutputStream fileOutputStream;
//    private static ObjectOutputStream objectOutputStream;
//    private static FileInputStream fileInputStream;
//    private static ObjectInputStream objectInputStream;
//    private static FileWriter fileWriter;
//    private static FileReader fileReader;
//    private static Scanner fileScanner;

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
    private Button getAdornmentInfo;

    @FXML
    private Button printAdornmentTitles;

    @FXML
    private Button serializeStorage;

    @FXML
    private Button deserializeStorage;

    @FXML
    private Label countSerializated;

    @FXML
    void addMetal(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingMetal.fxml"));
        showScene(root, event);
    }

    @FXML
    void addStone(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AddingStone.fxml"));
        showScene(root, event);
    }

    @FXML
    void checkStorage(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/StorageContent.fxml"));
        showScene(root, event);
    }

    @FXML
    void createAdornment(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateAdornment.fxml"));
        showScene(root, event);
    }

    @FXML
    void createEarringBase(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateEarringBase.fxml"));
        showScene(root, event);
    }

    @FXML
    void createNecklaceBase(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateNecklaceBase.fxml"));
        showScene(root, event);
    }

    @FXML
    void createRingBase(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/CreateRingBase.fxml"));
        showScene(root, event);
    }

    @FXML
    void getAdornmentInfo(ActionEvent event) throws IOException {
        addMetal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/by/bsuir/german/FXML/AdornmentInfo.fxml"));
        showScene(root, event);
    }

    @FXML
    void deserializeStorage(ActionEvent event) throws IOException, ClassNotFoundException {
        try {
            System.out.println("Десиреализация хранилища...");
            logic.fillStorage(serialization.desirealizeStorage());
            System.out.println("Успех!");
            countSerializated.setText(""+(Integer.parseInt(countSerializated.getText())-1));
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        } catch (NullPointerException e) {
            System.out.println("Файл пуст! Нечего десериализоввывать.");
        }
    }

    @FXML
    void printAdornmentTitles(ActionEvent event) throws IOException {
        try {
            String s = storage.getAdormentTitles();
            io.write(s);
            System.out.println("Запись прошла успешно");
            io.read();
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        } catch (NullPointerException e) {
            System.out.println("Список пуст! Нечего переписывать!.");
        }
    }

    @FXML
    void serializeStorage(ActionEvent event) {
        try {
            Storage storageFull = new Storage(storage.getStones(), storage.getMetals(), storage.getAdornments(),
                    storage.getRingBases(), storage.getNecklaceBases(), storage.getEarringBases());
            serialization.serializeStorage(storageFull);
            countSerializated.setText(""+(Integer.parseInt(countSerializated.getText())+1));
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        } catch (NullPointerException e) {
            System.out.println("Список пуст! Нечего сериализоввывать.");
        }
    }

    @FXML
    void workWithStorage(ActionEvent event) {

    }

    @FXML
    void initialize() {
        System.out.println("IN CONTRROLLER");
        mainFX = new MainFX();
        storage = mainFX.getStorage();
        logic = mainFX.getLogic();
        io = mainFX.getIO();
        serialization = mainFX.getSerialization();
    }

    private void showScene(Parent root, ActionEvent event) {
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
