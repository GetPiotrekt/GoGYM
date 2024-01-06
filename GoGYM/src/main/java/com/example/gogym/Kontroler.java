package com.example.gogym;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Kontroler {

    @FXML
    private void pRozpocznijTrening() {
        Aplikacja.zmienScene("ROZPOCZNIJ_TRENING.fxml");
    }

    @FXML
    private void pPodciaganie() {
        Aplikacja.zmienScene("PODCIAGANIE.fxml");
    }

    @FXML
    private void pLawkaPlaska() {
        Aplikacja.zmienScene("LAWKA_PLASKA.fxml");
    }

    @FXML
    private void pMartwyCiag() {
        Aplikacja.zmienScene("MARTWY_CIAG.fxml");
    }

    @FXML
    private void pHistoriaTreningow() {
        Aplikacja.zmienScene("HISTORIA_TRENINGOW.fxml");
    }

    @FXML
    private void pPodsumowanie() {
        Aplikacja.zmienScene("PODSUMOWANIE.fxml");
    }

    @FXML
    private void pEkranStartowy() {
        Aplikacja.zmienScene("EKRAN_STARTOWY.fxml");
    }

    @FXML
    private void pKalkulatorBMR() {
        Aplikacja.zmienScene("KALKULATOR_BMR.fxml");
    }

    @FXML
    private Label infoLabel;

    @FXML
    private TextField aktualnaWagaField;

    @FXML
    private TextField aktualnyCiezarField;

    @FXML
    private TextField iloscPowtorzenField;

    @FXML
    private Label numerSeriiLabel;

    int numerSerii = 2;
    float objetosc = 0;

    @FXML
    private void LawkaPlaska() {
        try {
            // Pobieranie wartości z pól tekstowych
            float aktualnyCiezar = Float.parseFloat(aktualnyCiezarField.getText());
            int iloscPowtorzen = Integer.parseInt(iloscPowtorzenField.getText());

            objetosc += aktualnyCiezar * iloscPowtorzen;

            numerSeriiLabel.setText("NUMER SERII: " + numerSerii + "\nAKTUALNA OBJETOŚĆ TRENINGOWA: " + objetosc);
            numerSerii++;

            infoLabel.setText("Wpisz dane dla kolejnej serii.");
        } catch (NumberFormatException e) {
            // Obsługa błędów związanych z nieprawidłowym formatem liczbowym
            infoLabel.setText("Wprowadź poprawne dane liczbowe.");
        } catch (Exception e) {
            // Obsługa innych wyjątków
            e.printStackTrace();
        }
    }

    @FXML
    private void MartwyCiag() {
        try {
            // Pobieranie wartości z pól tekstowych
            float aktualnyCiezar = Float.parseFloat(aktualnyCiezarField.getText());
            int iloscPowtorzen = Integer.parseInt(iloscPowtorzenField.getText());

            objetosc += aktualnyCiezar * iloscPowtorzen;

            numerSeriiLabel.setText("NUMER SERII: " + numerSerii + "\nAKTUALNA OBJETOŚĆ TRENINGOWA: " + objetosc);
            numerSerii++;

            infoLabel.setText("Wpisz dane dla kolejnej serii.");
        } catch (NumberFormatException e) {
            infoLabel.setText("Wprowadź poprawne dane liczbowe.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Podciaganie() {
        try {
            // Pobieranie wartości z pól tekstowych
            float aktualnaWaga = Float.parseFloat(aktualnaWagaField.getText());
            float aktualnyCiezar = Float.parseFloat(aktualnyCiezarField.getText());
            int iloscPowtorzen = Integer.parseInt(iloscPowtorzenField.getText());

            objetosc += aktualnaWaga + (aktualnyCiezar * iloscPowtorzen);

            numerSeriiLabel.setText("NUMER SERII: " + numerSerii + "\nAKTUALNA OBJETOŚĆ TRENINGOWA: " + objetosc);
            numerSerii++;

            infoLabel.setText("Wpisz dane dla kolejnej serii.");
        } catch (NumberFormatException e) {
            infoLabel.setText("Wprowadź poprawne dane liczbowe.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private RadioButton mezczyznaRadioButton;

    @FXML
    private RadioButton kobietaRadioButton;

    @FXML
    private TextField aktualnyWzrostField;

    @FXML
    private TextField wiekField;

    @FXML
    private ChoiceBox<String> aktywnoscChoiceBox;

    @FXML
    private void handleGenderSelection(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) event.getSource();
        mezczyznaRadioButton.setSelected(selectedRadioButton == mezczyznaRadioButton);
        kobietaRadioButton.setSelected(selectedRadioButton == kobietaRadioButton);
    }

    @FXML
    private void ObliczBMR() {
        try {
            // Pobieranie danych z pól tekstowych
            double waga = Double.parseDouble(aktualnaWagaField.getText());
            double wzrost = Double.parseDouble(aktualnyWzrostField.getText());
            int wiek = Integer.parseInt(wiekField.getText());

            // Wybieranie współczynnika aktywności
            double aktywnoscFactor = switch (aktywnoscChoiceBox.getValue()) {
                case "Niska aktywność (ćwiczenia 1-3 razy w tygodniu)" -> 1.2;
                case "Średnia aktywność (ćwiczenia 3-5 razy w tygodniu)" -> 1.375;
                case "Wysoka aktywność (ćwiczenia codziennie)" -> 1.55;
                case "Bardzo wysoka aktywność (ćwiczenia kilka razy dziennie)" -> 1.725;
                default -> 1.0; // Brak aktywności fizycznej
            };

            // Obliczanie BMR w zależności od płci
            double bmr;
            if (mezczyznaRadioButton.isSelected()) {
                bmr = (10 * waga) + (6.25 * wzrost) - (5 * wiek) + 5;
            } else if (kobietaRadioButton.isSelected()) {
                bmr = (10 * waga) + (6.25 * wzrost) - (5 * wiek) - 161;
            } else {
                infoLabel.setText("Wybierz płeć przed obliczeniem BMR.");
                return;
            }

            // Obliczanie BMR z uwzględnieniem aktywności
            double bmrAktywnosc = bmr * aktywnoscFactor;

            // Wyświetlanie wyniku
            infoLabel.setText("Twoje BMR z uwzględnieniem aktywności wynosi: \n" + bmrAktywnosc);

        } catch (NumberFormatException e) {
            System.out.println("Wprowadź poprawne dane liczbowe.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}