package com.javaonezeroone.plutoplanetnine;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginScreenController {
    public PasswordField txtPassword;
    public TextField txtUsername;
    @FXML
    public Label lblRegister;
    public Label lblForgottenPassword;

    public Button btnSignIn;
    public Button btnExit;
    public Label lblWelcomeBackText;
    public Label lblWelcomeMessage;

    public void btnExitAction(){
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    public void lblRegisterAction() {
        lblForgottenPassword.setText("");
        btnSignIn.setText("Register");
    }

    public void btnSignInAction() throws IOException {
        //close stage
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();

        //open HomeScreen
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home_screen.fxml")));
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Home");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}