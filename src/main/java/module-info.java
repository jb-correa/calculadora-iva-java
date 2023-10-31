module com.example.calculadoraspring {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.calculadoraspring to javafx.fxml;
    exports com.example.calculadoraspring;
}