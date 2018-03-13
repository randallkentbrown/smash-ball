/* created by Kent Brown on 2/6/2018 */

/* package */
package com.smashball.java.main.view.pane;

/* imports */
import javafx.scene.layout.Pane;

/* implementation */
class SmashballPane extends Pane {

    // STATE //
    private static String PROTOCOL = "file:\\\\\\";
    private static String RESOURCES_URL = "\\src\\resources\\";

    // CONSTRUCTOR //
    protected SmashballPane() {

    }

    // GETTERS & SETTERS //
    protected static final String getResourceURL() {
        String wd = System.getProperty("user.dir");
        return PROTOCOL + wd + RESOURCES_URL;
    }

    // BEHAVIOUR //
    void load() {
        // Default load method, shared by all subclasses. //

    }

}
