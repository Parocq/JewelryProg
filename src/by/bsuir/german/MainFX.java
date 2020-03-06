package by.bsuir.german;

import by.bsuir.german.controller.AddingMetalController;
import by.bsuir.german.controller.MainMenuController;
import by.bsuir.german.service.Storage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MainFX extends Application {

    private Storage storage = new Storage();

    @Override
    public void start(Stage myStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/MainMenu.fxml"));

        Scene scene = new Scene(root);
        myStage.setScene(scene);
        myStage.setTitle("Jewelry shop");


//        AddingMetalController amc = new AddingMetalController(storage);
//        MainMenuController mmc = new MainMenuController(storage,amc);

        myStage.show();
    }


    public static void main(String[] args) {
        System.out.println("Зaпycк приложения JavaFX");
        launch(args);
    }

    public Storage getStorage(){
        return storage;
    }
}