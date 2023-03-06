package com.kensport.ken_sport;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {

    @FXML
    TextField txtArFootQty, txtArBasketQty, txtArVolleyQty;

    @FXML
    Text txtTotalSales, txtTax, txtTotalItems, txtSubtotalPrice, txtTotalPriceVolleyball, txtTotalPriceBasketball, txtTotalPriceFootball;

    @FXML
    Button btnCheckout, btnExit, btnClear;

    // exit app
    @FXML
    void btnExitAction() {
        // get a handle to the stage
        Stage stage = (Stage) btnExit.getScene().getWindow();
        // close
        stage.close();
    }

    // var for item quantity
    int footballQty, basketballQty, volleyballQty, totalItems;

    // var for getting prices
    double footballTotalPrice, basketballTotalPrice, volleyballTotalPrice, subtotalPrice, tax, totalSales;

    @FXML
    void btnCheckoutAction() {
        // getting user input and storing them into int variables
        footballQty = Integer.parseInt(txtArFootQty.getText());
        basketballQty = Integer.parseInt(txtArBasketQty.getText());
        volleyballQty = Integer.parseInt(txtArVolleyQty.getText());

        // getting total items
        totalItems = footballQty + basketballQty + volleyballQty;
        txtTotalItems.setText(String.valueOf(totalItems)); //outputting total items

        // getting total price for each item:
        footballTotalPrice = footballQty * 44.00;
        basketballTotalPrice = basketballQty * 49.00;
        volleyballTotalPrice = volleyballQty * 39.00;

        // getting Sub-Total
        subtotalPrice = footballTotalPrice + basketballTotalPrice + volleyballTotalPrice;

        // getting Tax @5%
        tax = Math.round((subtotalPrice * 0.05) * 100.0) / 100.0;

        // getting total sales
        totalSales = Math.round((subtotalPrice - tax) * 100.0) / 100.0;

        // outputting total prices
        txtTotalPriceFootball.setText("Ksh. " + footballTotalPrice);
        txtTotalPriceBasketball.setText("Ksh. " + basketballTotalPrice);
        txtTotalPriceVolleyball.setText("Ksh. " + volleyballTotalPrice);
        txtSubtotalPrice.setText("Ksh. " + subtotalPrice);
        txtTax.setText("Ksh. " + tax);
        txtTotalSales.setText("Ksh. " + totalSales);
    }

    @FXML
    void btnClearAction() {
        // clear UI output
        txtArFootQty.clear();
        txtArBasketQty.clear();
        txtArVolleyQty.clear();
        txtTotalItems.setText("");
        txtTotalPriceFootball.setText("");
        txtTotalPriceBasketball.setText("");
        txtTotalPriceVolleyball.setText("");
        txtSubtotalPrice.setText("");
        txtTax.setText("");
        txtTotalSales.setText("");

        // clear var data
        footballQty = 0;
        basketballQty = 0;
        volleyballQty = 0;
        totalItems = 0;
        footballTotalPrice = 0;
        basketballTotalPrice = 0;
        volleyballTotalPrice = 0;
        subtotalPrice = 0;
        tax = 0;
        totalSales = 0;
    }
}