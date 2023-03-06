module com.cjsrestaurant.cjs_restaurant_gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.cjsrestaurant.cjs_restaurant_gui to javafx.fxml;
    exports com.cjsrestaurant.cjs_restaurant_gui;
}