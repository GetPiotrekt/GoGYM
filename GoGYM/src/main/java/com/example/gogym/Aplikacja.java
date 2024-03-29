package com.example.gogym;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Aplikacja extends Application {
    private static Stage primaryStage;

    public static void zmienScene(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(Aplikacja.class.getResource(fxml));
            Parent root = loader.load();

            primaryStage.getScene().setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Aplikacja.primaryStage = primaryStage;
        primaryStage.setWidth(460);
        primaryStage.setHeight(640);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EKRAN_STARTOWY.fxml"));
        Parent root = loader.load();

        primaryStage.getIcons().add(new Image("file:src/logo.png"));
        primaryStage.setTitle("GoGYM");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}