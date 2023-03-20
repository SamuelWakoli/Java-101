package com.cjs_restaurant;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
}
