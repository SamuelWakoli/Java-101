package com.cjs_restaurant.helper;

import com.cjs_restaurant.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelperFunctions {
    /**
     * This function [performNavigation], does the actual navigation by setting a new scene.
     * This function is reusable in navigating to other pages, using various controls.
     */
    public static void performNavigation(Stage stage, String resourcePath) throws IOException {
        //open nextScreen
        FXMLLoader nextScreenRoot = new FXMLLoader(Main.class.getResource(resourcePath));
        Scene nextScreenScene = new Scene(nextScreenRoot.load(), 1200, 800);
        stage.setScene(nextScreenScene);
        stage.centerOnScreen();
        stage.setResizable(true);
    }
    public static void nextScreenUsingTextCtrl(Text textControl, String nextScreenName) throws IOException {
        // Stage object called: stage
        Stage stage = (Stage) textControl.getScene().getWindow(); // (Stage) - this is type casting

        String resourcePath = "/com/cjs_restaurant/view/" + nextScreenName + ".fxml";

        //perform navigation here
        performNavigation(stage, resourcePath);
    }

    // navigate using a Button control
    public static void nextScreenUSingBtnCtrl(Button buttonControl, String nextScreenName) throws IOException {
        // Stage object called: stage
        Stage stage = (Stage) buttonControl.getScene().getWindow();

        String resourcePath = "/com/cjs_restaurant/view/" + nextScreenName + ".fxml";

        //perform navigation here
        performNavigation(stage, resourcePath);
    }
}
