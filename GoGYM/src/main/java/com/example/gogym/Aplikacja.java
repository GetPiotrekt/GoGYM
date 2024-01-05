package com.example.gogym;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplikacja extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EKRAN_STARTOWY.fxml"));
        Parent root = loader.load();

        Kontroler controller = loader.getController();
        controller.setPrimaryStage(primaryStage);

        primaryStage.setTitle("Okno Główne");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}