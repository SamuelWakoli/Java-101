package com.cjs_restaurant;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

import static com.cjs_restaurant.helper.HelperFunctions.nextScreenUSingBtnCtrl;

public class MenuScreenController {

    //getting controls from the UI
    public Button btnExit;
    public Button btnHome;
    public CheckBox checkChickenWings;
    public CheckBox checkMozzarella;
    public CheckBox checkGarlicBread;
    public CheckBox checkGrilledSalmon;
    public CheckBox checkSpaghettiBolognese;
    public CheckBox checkBeefStirFry;
    public CheckBox checkCheesecake;
    public CheckBox checkChocolateMousse;
    public CheckBox checkIceCreamSundae;
    public Text txtTotalCost;
    public Button btnPay;

    // closes the app
    public void exitApp() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    // go home screen
    public void goHomeScreen() throws IOException {
        nextScreenUSingBtnCtrl(btnHome, "home_screen");
    }

    // variables used to store food item prices
    Double totalCost = 0.0,
    // Appetizers
    priceChickenWings = 350.0, priceMozzarella = 300.0, priceGarlicBread = 250.0,
    // Entrees
    priceGrilledSalmon = 800.0, priceSpaghettiBolognese = 600.0, priceBeefStirFry = 750.0,
    // Desserts
    priceCheesecake = 350.0, priceChocolateMousse = 300.0, priceIceCreamSundae = 250.0;

    // check event

    /**
     *
     * @param checkBoxCtrl is used to determine if the food item is selected.
     *                     if true, add food item price to the total cost
     *                     if false, if cost is not zero, remove food item price.
     * @param menuItemPrice is added or removed from the total cost.
     */
    public void checkingEvent(CheckBox checkBoxCtrl, Double menuItemPrice) {
        if (checkBoxCtrl.isSelected()) {
            totalCost = totalCost + menuItemPrice;
            txtTotalCost.setText(String.valueOf(totalCost));
        } else {
            if (totalCost != 0.0) {
                totalCost = totalCost - menuItemPrice;
                txtTotalCost.setText(String.valueOf(totalCost));
            }
        }
    }

    public void actionChickenWings() {
        checkingEvent(checkChickenWings, priceChickenWings);
    }

    public void actionMozzarella() {
        checkingEvent(checkMozzarella, priceMozzarella);
    }

    public void actionGarlicBread() {
        checkingEvent(checkGarlicBread, priceGarlicBread);
    }

    public void actionGrilledSalmon() {
        checkingEvent(checkGrilledSalmon, priceGrilledSalmon);
    }

    public void actionSpaghettiBolognese() {
        checkingEvent(checkSpaghettiBolognese, priceSpaghettiBolognese);
    }

    public void actionBeefStirFry() {
        checkingEvent(checkBeefStirFry, priceBeefStirFry);
    }

    public void actionCheesecake() {
        checkingEvent(checkCheesecake, priceCheesecake);
    }

    public void actionChocolateMousse() {
        checkingEvent(checkChocolateMousse, priceChocolateMousse);
    }

    public void actionIceCreamSundae() {
        checkingEvent(checkIceCreamSundae, priceIceCreamSundae);
    }

    public void openPaymentDialog() {
        if (totalCost != 0.0) {
            Alert paymentDialog = new Alert(Alert.AlertType.CONFIRMATION);
            paymentDialog.setTitle("Select Payment Method");
            paymentDialog.setHeaderText(null);

            // Create radio buttons
            RadioButton mpesaBtn = new RadioButton("Mpesa");
            RadioButton paypalBtn = new RadioButton("PayPal");
            RadioButton creditCardBtn = new RadioButton("Credit Card");

            // Add radio buttons to a toggle group
            ToggleGroup paymentMethod = new ToggleGroup();
            mpesaBtn.setToggleGroup(paymentMethod);
            paypalBtn.setToggleGroup(paymentMethod);
            creditCardBtn.setToggleGroup(paymentMethod);

            // Set default selection
            mpesaBtn.setSelected(true);

            // Add radio buttons to a VBox
            VBox paymentOptions = new VBox(mpesaBtn, paypalBtn, creditCardBtn);
            paymentOptions.setSpacing(10);

            // Set the VBox as the dialog content
            DialogPane dialogPane = paymentDialog.getDialogPane();
            dialogPane.setContent(paymentOptions);

            // Add Okay and Cancel buttons
            dialogPane.getButtonTypes().clear();
            dialogPane.getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

            // Get selected payment method
            String selectedPayMethod;
            if (paypalBtn.isSelected()) {
                selectedPayMethod = "PayPal";
            } else if (creditCardBtn.isSelected()) {
                selectedPayMethod = "Credit Card";
            } else { //default to Mpesa
                selectedPayMethod = "Mpesa";
            }

            // Handle the Okay button action
            Stage stage = (Stage) dialogPane.getScene().getWindow();
            dialogPane.lookupButton(ButtonType.OK).setOnMousePressed(event -> {

                Alert confirmationDialog = new Alert(Alert.AlertType.INFORMATION);
                confirmationDialog.setTitle("Payment Prompt Sent");
                confirmationDialog.setHeaderText(null);
                confirmationDialog.setContentText(selectedPayMethod + " payment prompt of Ksh. " + totalCost + " has been sent to you.\nThank you for choosing CJ's Restaurant.");
                confirmationDialog.showAndWait();
                // Navigate to home screen
                try {
                    goHomeScreen();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage.close(); // close the current stage

                paymentDialog.close();
            });

            // Handle the Cancel button action
            dialogPane.lookupButton(ButtonType.CANCEL).setOnMousePressed(event -> paymentDialog.close());

            paymentDialog.showAndWait();
        } else { // total cost is zero
            // set button text
            btnPay.setText("Select food item");
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> btnPay.setText("Pay")));
            timeline.play();
        }
    }
}
