/* created by Kent Brown on 2/6/2018 */

/* package */
package com.smashball.java.main.view.pane;

/* imports */
import com.smashball.java.main.controller.resources.ResourceManager;
import javafx.scene.layout.Pane;

/* implementation */
public class SmashballPane extends Pane {

    // STATE //
    private boolean _loaded;

    // CONSTRUCTOR //
    SmashballPane() {
        _loaded = false;
    }

    // GETTERS & SETTERS //

    // BEHAVIOUR //
    public void load(ResourceManager rm) {
        // Default load method, shared by all subclasses. //
        _loaded = true;
    }

    public boolean isLoaded() {
        return _loaded;
    }

}
