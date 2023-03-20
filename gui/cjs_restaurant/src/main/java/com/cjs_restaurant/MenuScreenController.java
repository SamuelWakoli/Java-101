package com.cjs_restaurant;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
}
