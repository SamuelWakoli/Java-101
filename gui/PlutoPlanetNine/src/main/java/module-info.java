module com.javaonezeroone.plutoplanetnine {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.javaonezeroone.plutoplanetnine to javafx.fxml;
    exports com.javaonezeroone.plutoplanetnine;
}