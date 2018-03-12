/* created by Kent Brown on 2/6/2018 */

/* package */
package com.smashball.java.main.view.pane;

/* imports */
import javafx.scene.image.Image;

/* implementation */
// Uses the singleton pattern. //
public class LoadingPane extends SmashballPane {

    // STATE //
    private static final String TITLE_URL = RESOURCES_URL + "title.png";
    private static LoadingPane _instance;

    // CONSTRUCTOR //

    // GETTERS & SETTERS //
    public static LoadingPane getInstance() {
        if (_instance == null) { _instance = new LoadingPane(); }
        return _instance;
    }

    // BEHAVIOUR //
    @Override
    void load() {
        // Load the Background. //
        Image background = new Image(TITLE_URL);
    }

}
