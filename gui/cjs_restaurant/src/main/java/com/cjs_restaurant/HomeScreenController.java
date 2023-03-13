package com.cjs_restaurant;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeScreenController implements Initializable {

    @FXML
    private Button menuButton;

    @FXML
    private Button orderOnlineButton;

    @FXML
    private Button reservationsButton;

    @FXML
    private Button contactUsButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void showMenu() {
        // TODO: show the menu screen
    }

    @FXML
    private void showOrderOnline() {
        // TODO: show the online ordering screen
    }

    @FXML
    private void showReservations() {
        // TODO: show the reservations screen
    }

    @FXML
    private void showContactUs() {
//        try {
//            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/cjs_restaurant/view/contact_us_screen.fxml")));
//            Scene scene = new Scene(root);
//            Stage stage = (Stage) contactUsButton.getScene().getWindow();
//            stage.setScene(scene);
//        } catch (IOException e) {
//            Alert alert = new Alert(AlertType.ERROR, "Error loading contact us screen.");
//            alert.showAndWait();
//        }
    }

}
