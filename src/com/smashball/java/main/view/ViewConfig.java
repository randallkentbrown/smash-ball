/* created by Kent Brown on 2/5/2018 */

/* package */
package com.smashball.java.main.view;

/* imports */

import com.smashball.java.main.Main;
import com.smashball.java.main.util.Two.TwoInt;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

/* implementation */
public class ViewConfig {

    // STATE //
    private static final String defaultTitle = "Smashball";
    private static final TwoInt defaultResolution = new TwoInt(Main.defaultResX, Main.defaultResY);

    private String _title;
    private Parent _root;
    private TwoInt _resolution;

    // CONSTRUCTOR //
    public ViewConfig() {
        setTitle(defaultTitle);
        setResolution(defaultResolution);
        setRoot(new Pane());
    }
    public ViewConfig (String title, TwoInt resolution, Parent root) {
        _title = title;
        _root = root;
        _resolution = resolution;
    }

    // GETTERS & SETTERS //
    private void setTitle(String s) { _title = s; }
    private void setResolution(TwoInt t) { _resolution = t; }
    private void setRoot(Parent p) { _root = p; }
    String getTitle() { return _title; }
    TwoInt getResolution() { return _resolution; }
    Parent getRoot() { return _root; }

    // BEHAVIOUR //
    public int getResolutionX() { return getResolution().first(); }
    public int getResolutionY() { return getResolution().second(); }

}
