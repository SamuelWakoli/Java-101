package com.cjs_restaurant;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static com.cjs_restaurant.helper.HelperFunctions.nextScreenUsingTextCtrl;

public class HomeScreenController {


    public Text btnMenu;
    public Text btnLocations;
    public Text btnCareers;
    public Text btnFeedBack;
    public Text btnAboutUs;
    public Button btnExit;

    public void showMenu() throws IOException {
        nextScreenUsingTextCtrl(btnMenu, "menu_screen");
    }

    public void showLocations() throws IOException {
        nextScreenUsingTextCtrl(btnLocations, "locations_screen");
    }

    public void showCareers() throws IOException {
        nextScreenUsingTextCtrl(btnCareers, "careers_screen");
    }

    public void showFeedback() throws IOException {
        nextScreenUsingTextCtrl(btnFeedBack, "feedback_screen");
    }

    public void showAboutUs() throws IOException {
        nextScreenUsingTextCtrl(btnAboutUs, "about_us_screen");
    }

    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

}
