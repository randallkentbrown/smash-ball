/* created by Kent Brown on 2/6/2018 */

/* package */
package com.smashball.java.main.view.pane;

/* imports */
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

/* implementation */
// Uses the singleton pattern. //
public class LoadingPane extends SmashballPane {

    // STATE //
    private static final String TITLE_URL = SmashballPane.getResourceURL() + "title.png";
    private static LoadingPane _instance;

    // CONSTRUCTOR //

    // GETTERS & SETTERS //
    public static LoadingPane getInstance() {
        if (_instance == null) {
            _instance = new LoadingPane();
            _instance.load();
        }
        return _instance;
    }

    // BEHAVIOUR //
    @Override
    void load() {
        // Get the background image from resources. //
        Image background = new Image(TITLE_URL);

        // Create a new image view with that image. //
        ImageView imgView = new ImageView(background);

        // Add that image to the pane. //
        addChild(imgView);
    }

    // Add Node e to the children list. //
    private void addChild(Node e) {
        getChildren().add(e);
    }

}
