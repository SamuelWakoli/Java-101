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


    public void showMenu() throws IOException {
        //close stage
        Stage stage = (Stage) btnMenu.getScene().getWindow();

        //open MenuScreen
        FXMLLoader menuScreenRoot = new FXMLLoader(Main.class.getResource("/com/cjs_restaurant/view/menu_screen.fxml"));
        Scene menuScreenScene = new Scene(menuScreenRoot.load(), 1200, 800);
        stage.setScene(menuScreenScene);
        stage.centerOnScreen();
        stage.setResizable(true);
    }

    public void showLocations() {

    }

    public void showCareers() {

    }

    public void showFeedback() {

    }

    public void showAboutUs() {

    }

    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

}
