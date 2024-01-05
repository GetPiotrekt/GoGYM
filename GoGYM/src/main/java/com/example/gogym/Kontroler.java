package com.example.gogym;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Kontroler {
    @FXML
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    private void setNewScene(String fxmlResource) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlResource));
            Parent root = loader.load();
            primaryStage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pRozpocznijTrening(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ROZPOCZNIJ_TRENING.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pPodciaganie(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PODCIAGANIE.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
    }

    @FXML
    private void pLawkaPlaska(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LAWKA_PLASKA.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pMartwyCiag(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MARTWY_CIAG.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pHistoriaTreningow(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HISTORIA_TRENINGOW.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pPodsumowanie(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PODSUMOWANIE.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void pEkranStartowy(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EKRAN_STARTOWY.fxml"));
            Parent root = loader.load();

            Stage secondStage = new Stage();
            secondStage.setScene(new Scene(root));
            secondStage.setTitle("Trening");

            // Zamykaj stare okno, jeśli zostało ustawione
            if (primaryStage != null) {
                primaryStage.close();
            }

            // Ustaw aktualne okno jako primaryStage
            primaryStage = secondStage;

            // Otwieraj nowe okno
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}