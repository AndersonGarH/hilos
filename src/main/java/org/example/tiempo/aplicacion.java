package org.example.tiempo;
//aqui se pone todo lo relacionado con la escena

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class aplicacion extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(aplicacion.class.getResource("aplicacion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300,300);
        stage.setTitle("temporizador");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       launch();
    }


}
