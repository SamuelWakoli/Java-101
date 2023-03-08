module com.cjsrestaurant.cjs_retaurant {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.cjsrestaurant.cjs_retaurant to javafx.fxml;
    exports com.cjsrestaurant.cjs_retaurant;
}