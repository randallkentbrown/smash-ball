/* created by Kent Brown on 2/5/2018 */

/* package */
package com.smashball.java.main.view;

/* imports */
import javafx.scene.Scene;
import javafx.stage.Stage;

/* implementation */
public class SmashballStage extends Stage {

    // STATE //

    // CONSTRUCTOR //
    public SmashballStage(ViewConfig cfg) {
        // Call super-constructor. //
        super();

        // Setup. //
        setup(cfg);
    }

    // GETTERS & SETTERS //

    // BEHAVIOUR //
    private void setup(ViewConfig cfg) {

        // Grab a default configuration in the event that none is specified. //
        if (cfg == null) {
            cfg = new ViewConfig();
        }

        // Set up the stage. //
        setTitle(cfg.getTitle());
        setWidth(cfg.getResolutionX());
        setHeight(cfg.getResolutionY());

        // Create the main scene. //
        Scene primaryScene = new Scene(cfg.getRoot(), cfg.getResolutionX(), cfg.getResolutionY());
        setScene(primaryScene);

        // 
    }

}
