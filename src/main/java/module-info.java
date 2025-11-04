module org.example.tiempo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tiempo to javafx.fxml;
    exports org.example.tiempo;
}