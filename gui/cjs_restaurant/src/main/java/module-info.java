module com.cjs_restaurant.cjs_restaurant {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.cjs_restaurant.cjs_restaurant to javafx.fxml;
    exports com.cjs_restaurant.cjs_restaurant;
}