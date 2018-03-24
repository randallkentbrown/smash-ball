package com.smashball.java.main;

import com.smashball.java.main.controller.resources.ResourceManager;
import com.smashball.java.main.model.geom.PointInt;
import com.smashball.java.main.view.SmashballStage;
import com.smashball.java.main.view.ViewConfig;
import com.smashball.java.main.view.LoadingPane;
import com.smashball.java.main.view.SmashballPane;
import javafx.application.Application;
import javafx.stage.Stage;

public class SmashballApplication extends Application {

    // GLOBAL CONSTANTS. //
    public static final int defaultResX = 800;
    public static final int defaultResY = 600;

    // STATE. //
    private SmashballStage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Initialize ResourceManager //
        ResourceManager resourceManager = new ResourceManager();
        resourceManager.loadData();                                     // NOTE: WILL BE DEPRECATED

        // Define ViewConfig parameters. //
        String title = "Smashball";
        SmashballPane rootPane = LoadingPane.getInstance();
        rootPane.load(resourceManager);
        PointInt resolution = new PointInt(defaultResX, defaultResY);

        // Initialize ViewConfig. //
        ViewConfig config = new ViewConfig(
                title,
                resolution,
                rootPane
        );

        // Construct stage. //
        stage = new SmashballStage(config);

        // Display the stage. //
        stage.runPane(resourceManager);
    }

    // Start the application. //
    public static void main(String[] args) {
        launch(args);
    }
}
