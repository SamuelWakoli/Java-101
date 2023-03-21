package com.cjs_restaurant;

import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

import static com.cjs_restaurant.helper.HelperFunctions.nextScreenUSingBtnCtrl;

public class FeedbackScreenController {

    //getting controls from the UI
    public Button btnExit;
    public Button btnHome;
    public TextArea feedbackTextArea;
    public Button submitButton;

    // closes the app
    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    // go home screen
    public void goHomeScreen() throws IOException {
        nextScreenUSingBtnCtrl(btnHome, "home_screen");
    }

    public void handleSubmitButtonAction() {
        // Get feedback from the text area
        String feedback = feedbackTextArea.getText().trim();

        if (feedback.isEmpty()) {
            // Show an error dialog if feedback is empty
            Alert errorDialog = new Alert(Alert.AlertType.ERROR);
            errorDialog.setTitle("Error");
            errorDialog.setHeaderText(null);
            errorDialog.setContentText("Please enter your feedback.");
            errorDialog.showAndWait();
        } else {
            // Show a confirmation dialog if feedback is submitted successfully
            Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationDialog.setTitle("Feedback Received");
            confirmationDialog.setHeaderText(null);
            confirmationDialog.setContentText("Thank you for your feedback!");
            ButtonType okayButton = new ButtonType("Okay", ButtonBar.ButtonData.OK_DONE);
            confirmationDialog.getButtonTypes().setAll(okayButton);
            confirmationDialog.showAndWait();

            // Navigate to the home screen when the okay button is clicked
            if (confirmationDialog.getResult() == okayButton) {
                try {
                    nextScreenUSingBtnCtrl(submitButton, "home_screen");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
