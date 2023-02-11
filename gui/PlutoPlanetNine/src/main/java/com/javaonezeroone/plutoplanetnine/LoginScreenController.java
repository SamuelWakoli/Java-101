package com.javaonezeroone.plutoplanetnine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginScreenController {
    public PasswordField txtPassword;
    public TextField txtUsername;
    @FXML
    public Label lblRegister;
    public Label lblForgottenPassword;

    public Button btnSignIn;
    public Button btnExit;

    public void btnExitAction(ActionEvent e){
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}