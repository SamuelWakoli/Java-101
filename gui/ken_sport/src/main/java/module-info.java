module com.kensport.ken_sport {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.kensport.ken_sport to javafx.fxml;
    exports com.kensport.ken_sport;
}