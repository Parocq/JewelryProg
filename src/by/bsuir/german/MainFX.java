package by.bsuir.german;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MainFX extends Application {

    @Override
    public void start(Stage myStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/MainMenu.fxml"));

        Scene scene = new Scene(root);
        myStage.setScene(scene);

        myStage.setTitle("Jewelry shop");
        myStage.setWidth(800);
        myStage.setHeight(500);

        myStage.show();
    }


    public static void main(String[] args) {
        System.out.println("Зaпycк приложения JavaFX");
        launch(args);
    }
}