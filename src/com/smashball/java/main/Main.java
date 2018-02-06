package com.smashball.java.main;

import com.smashball.java.main.util.Two.TwoInt;
import com.smashball.java.main.view.SmashballStage;
import com.smashball.java.main.view.ViewConfig;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    // GLOBAL CONSTANTS. //
    public static final int defaultResX = 800;
    public static final int defaultResY = 600;


    // STATE. //
    private SmashballStage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Define ViewConfig parameters. //
        String title = "Smashball";
        Pane rootPane = new Pane();
        TwoInt resolution = new TwoInt(defaultResX, defaultResY);

        // Initialize ViewConfig. //
        ViewConfig config = new ViewConfig(
                title,
                resolution,
                rootPane
        );

        // Construct stage. //
        stage = new SmashballStage(config);

        // Display the stage. //
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
