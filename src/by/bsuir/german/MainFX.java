package by.bsuir.german;

import by.bsuir.german.controller.AddingMetalController;
import by.bsuir.german.controller.MainMenuController;
import by.bsuir.german.entity.*;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.IO;
import by.bsuir.german.service.Logic;
import by.bsuir.german.service.Serialization;
import by.bsuir.german.service.Storage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainFX extends Application {

    private static Storage storage;
    private static FileOutputStream fileOutputStream;
    private static ObjectOutputStream objectOutputStream;
    private static FileInputStream fileInputStream;
    private static ObjectInputStream objectInputStream;
    private static FileWriter fileWriter;
    private static FileReader fileReader;
    private static Scanner fileScanner;
    private static Logic logic;
    private static Serialization serialization;
    private static IO io;
    private AdornmentExtended adornmentExtended;

    @Override
    public void start(Stage myStage) throws Exception {
        try {
            fileOutputStream = new FileOutputStream("Storage.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            fileInputStream = new FileInputStream("Storage.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            fileWriter = new FileWriter("MainTask.txt");
            fileReader = new FileReader("MainTask.txt");
            fileScanner = new Scanner(fileReader);


            MainFX mainFX = new MainFX();
            io = new IO(fileReader, fileWriter, fileScanner, storage);
            storage = new Storage();
            logic = new Logic(storage);
            storage = mainFX.getStorage();
            serialization = new Serialization(objectOutputStream, objectInputStream);
            io = mainFX.getIO();
            adornmentExtended = new AdornmentExtended(logic,storage);

            Stone stone = new Stone("Камень",22.3,12.3,"Красный",true,11.2);
            storage.addStoneOnStock(stone);
            List<Stone> stoneList = new ArrayList<>();
            stoneList.add(stone);
            Metal metal = new Metal("Металл",323.23,232.1,2.3);
            storage.addMetalOnStock(metal);
            RingBase ringBase =  new RingBase("Кольца основа",32,45, metal,32.3,"Кольцо");
            storage.addRingBaseOnStock(ringBase);

            Adornment adornment = new Adornment("Украшение", ringBase,stoneList);
            storage.addAdornmentOnStock(adornment);

            Parent root = FXMLLoader.load(getClass().getResource("FXML/NewMainScreen.fxml"));

            Scene scene = new Scene(root);
            myStage.setScene(scene);
            myStage.setTitle("Jewelry shop");
            System.out.println("START");
            myStage.show();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка при вводе данных! Проверьте вводимые типы!");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

    public Storage getStorage() {
        return storage;
    }

    public Logic getLogic() {
        return logic;
    }

    public IO getIO() {
        return io;
    }

    public Serialization getSerialization() {
        return serialization;
    }
}