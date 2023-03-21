package com.cjs_restaurant;

import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static com.cjs_restaurant.helper.HelperFunctions.nextScreenUSingBtnCtrl;

public class AboutUsScreenController {

    //getting controls from the UI
    public Button btnExit;
    public Button btnHome;

    // closes the app
    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    // go home screen
    public void goHomeScreen() throws IOException {
        nextScreenUSingBtnCtrl(btnHome, "home_screen");
    }
}
