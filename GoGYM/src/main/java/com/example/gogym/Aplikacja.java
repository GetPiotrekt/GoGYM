package com.example.gogym;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplikacja extends Application {
    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setWidth(360);
        primaryStage.setHeight(640);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EKRAN_STARTOWY.fxml"));
        Parent root = loader.load();

        Kontroler controller = loader.getController();
        controller.setAplikacja(this);

        primaryStage.setTitle("Okno Główne");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void zmienScene(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(Aplikacja.class.getResource(fxml));
            Parent root = loader.load();

            primaryStage.getScene().setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
