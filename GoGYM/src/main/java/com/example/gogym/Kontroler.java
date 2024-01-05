package com.example.gogym;

import javafx.fxml.FXML;

public class Kontroler {
    private Aplikacja aplikacja;

    public void setAplikacja(Aplikacja aplikacja) {
        this.aplikacja = aplikacja;
    }

    @FXML
    private void pRozpocznijTrening() {
        aplikacja.zmienScene("ROZPOCZNIJ_TRENING.fxml");
    }

    @FXML
    private void pPodciaganie() {
        aplikacja.zmienScene("PODCIAGANIE.fxml");
    }

    @FXML
    private void pLawkaPlaska() {
        aplikacja.zmienScene("LAWKA_PLASKA.fxml");
    }

    @FXML
    private void pMartwyCiag() {
        aplikacja.zmienScene("MARTWY_CIAG.fxml");
    }

    @FXML
    private void pHistoriaTreningow() {
        aplikacja.zmienScene("HISTORIA_TRENINGOW.fxml");
    }

    @FXML
    private void pPodsumowanie() {
        aplikacja.zmienScene("PODSUMOWANIE.fxml");
    }

    @FXML
    private void pEkranStartowy() {
        aplikacja.zmienScene("EKRAN_STARTOWY.fxml");
    }
}
