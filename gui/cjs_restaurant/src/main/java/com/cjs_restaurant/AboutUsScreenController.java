package com.cjs_restaurant;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AboutUsScreenController {

    //getting controls from the UI
    public Button btnExit;

    // closes the app
    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}