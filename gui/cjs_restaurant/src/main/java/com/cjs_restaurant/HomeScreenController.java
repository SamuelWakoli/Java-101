package com.cjs_restaurant;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeScreenController {


    public Text btnMenu;
    public Text btnLocations;
    public Text btnCareers;
    public Text btnFeedBack;
    public Text btnAboutUs;
    public Button btnExit;

    /**
     * This function [nextScreen] takes 2 parameters:
     * 1. the ID of a control, used to get current window of the app.
     * 2. the name of the next view to be navigated to, when the control is clicked.
     * This function is reusable in navigating to other pages
     */
    void nextScreen(Text textControl, String nextScreenName) throws IOException {
        //close stage
        Stage stage = (Stage) textControl.getScene().getWindow();

        String resourcePath = "/com/cjs_restaurant/view/" + nextScreenName + ".fxml";
        //open MenuScreen
        FXMLLoader menuScreenRoot = new FXMLLoader(Main.class.getResource(resourcePath));
        Scene menuScreenScene = new Scene(menuScreenRoot.load(), 1200, 800);
        stage.setScene(menuScreenScene);
        stage.centerOnScreen();
        stage.setResizable(true);
    }

    public void showMenu() throws IOException {
        nextScreen(btnMenu, "menu_screen");
    }

    public void showLocations() throws IOException {
        nextScreen(btnLocations, "locations_screen");
    }

    public void showCareers() throws IOException {
        nextScreen(btnCareers, "careers_screen");
    }

    public void showFeedback() throws IOException {
        nextScreen(btnFeedBack, "feedback_screen");
    }

    public void showAboutUs() throws IOException {
        nextScreen(btnAboutUs, "about_us_screen");
    }

    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

}
