package com.javaonezeroone.plutoplanetnine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login_screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.initStyle(StageStyle.UNDECORATED); //removes the window frame
        //stage.setTitle("Pluto Planet Nine");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}