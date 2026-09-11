module org.example.farmfrenzy2djava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.farmfrenzy2djava to javafx.fxml;
    exports org.example.farmfrenzy2djava;
}