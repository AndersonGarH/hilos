package org.example.tiempo.controlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class controlador {

        @FXML
        private Label contador_corto;

        @FXML
        private Label contador_general;

        @FXML
        private Button iniciarBTN;

        @FXML
        private Button pararBTN;

        @FXML
        private Button pausarBTN;

        @FXML
        private Button reiniciarBTN;

        @FXML
        void iniciar(ActionEvent event) {
                timer.start();
        }

        @FXML
        void parar(ActionEvent event) {
                timer.stop();
        }

        @FXML
        void pausar(ActionEvent event) {
                timer.pausar();
        }

        @FXML
        void reiniciar(ActionEvent event) {
                timer.reiniciar();
        }

}
