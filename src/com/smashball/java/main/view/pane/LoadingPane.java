/* created by Kent Brown on 2/6/2018 */

/* package */
package com.smashball.java.main.view.pane;

/* imports */
import javafx.scene.Node;
import com.smashball.java.main.controller.resources.ResourceManager;
import javafx.scene.image.ImageView;

/* implementation */
// Uses the singleton pattern. //
public class LoadingPane extends SmashballPane {

    // STATE //
    // static keys //
    public static String KEY_TITLE = "ttl";

    // singleton instance //
    private static LoadingPane _instance;

    // nonstatic //
    private ImageView background;


    // CONSTRUCTOR //
    private LoadingPane() {
        background = null;
    }

    // GETTERS & SETTERS //
    public static LoadingPane getInstance() {
        if (_instance == null) {
            _instance = new LoadingPane();
        }
        return _instance;
    }

    // BEHAVIOUR //
    @Override
    public void load(ResourceManager manager) {
        if (!isLoaded()) {
            ImageView bckg = manager.getImageView(KEY_TITLE);
            setBackground(bckg);
        }
    }

    private void setBackground(ImageView imgView) {
        removeChild(background);
        background = imgView;
        addChild(background);

    }

    // Add Node e to the children list. //
    private void addChild(Node e) {
        getChildren().add(e);
    }

    private void removeChild(Node e) {
        getChildren().remove(e);
    }

}
