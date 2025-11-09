package org.example.tiempo.vista;
//aqui se pone todo lo relacionado con la escena

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class aplicacion extends Stage {

    public aplicacion() throws IOException {
        FXMLLoader loader = new FXMLLoader(aplicacion.class.getResource("tiempo.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("temporizador");
        stage.setScene(scene);
        stage.show();

    }

    public static void getInstance() throws IOException {
        if(aplicacion.INSTANCE == null){
            aplicacion.INSTANCE = new aplicacion();
        }
    }

    private static class aplicacionHolder{
        private static aplicacion INSTANCE;
    }
}


