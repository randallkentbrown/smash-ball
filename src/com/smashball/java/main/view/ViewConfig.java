/* created by Kent Brown on 2/5/2018 */

/* package */
package com.smashball.java.main.view;

/* imports */

import com.smashball.java.main.Main;
import com.smashball.java.main.model.geom.PointInt;
import com.smashball.java.main.view.pane.SmashballPane;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

/* implementation */
public class ViewConfig {

    // STATE //
    private static final String defaultTitle = "Smashball";
    private static final PointInt defaultResolution = new PointInt(Main.defaultResX, Main.defaultResY);

    private String _title;
    private SmashballPane _root;
    private PointInt _resolution;

    // CONSTRUCTOR //
    public ViewConfig() {
        setTitle(defaultTitle);
        setResolution(defaultResolution);
        setRoot(null);
    }
    public ViewConfig (String title, PointInt resolution, SmashballPane root) {
        _title      = title;
        _root       = root;
        _resolution = resolution;
    }

    // GETTERS & SETTERS //
    private void setTitle(String s) { _title = s; }
    private void setResolution(PointInt t) { _resolution = t; }
    private void setRoot(SmashballPane p) { _root = p; }
    String getTitle() { return _title; }
    PointInt getResolution() { return _resolution; }
    SmashballPane getRoot() { return _root; }

    // BEHAVIOUR //
    public int getResolutionX() { return getResolution().first(); }
    public int getResolutionY() { return getResolution().second(); }

}
