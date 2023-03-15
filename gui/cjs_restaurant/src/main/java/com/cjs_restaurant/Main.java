package com.cjs_restaurant;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/cjs_restaurant/view/splash_screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),  600, 400);
        primaryStage.initStyle(StageStyle.UNDECORATED); //removes the window frame
        //stage.setTitle("Pluto Planet Nine");
        primaryStage.setScene(scene);
        primaryStage.show();


        // Create a Timeline to navigate to the home screen after 5 seconds
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(6), event -> {
            try {
                FXMLLoader homeScreenRoot = new FXMLLoader(Main.class.getResource("/com/cjs_restaurant/view/home_screen.fxml"));
                Scene homeScreenScene = new Scene(homeScreenRoot.load(), 1200, 800);
                primaryStage.setScene(homeScreenScene);
                primaryStage.centerOnScreen();
                primaryStage.setResizable(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
