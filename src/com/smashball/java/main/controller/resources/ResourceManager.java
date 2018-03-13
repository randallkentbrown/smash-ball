/* Created by Kent Brown */

/* Package */
package com.smashball.java.main.controller.resources;

/* Imports */

import com.smashball.java.main.view.pane.LoadingPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;

/* Implementation */
public class ResourceManager
{
    // State //
    private static final String PROTOCOL = "file:\\\\\\";
    private static final String RESOURCES_URL = "\\src\\resources\\";
    private static final String TITLE_URL = getResourceURL() + "title.png";

    private ResourceLoader resourceLoader;
    private HashMap<String, Image> imageMap;

    // Constructor //
    public ResourceManager() {
        resourceLoader  = new ResourceLoader();
        imageMap        = new HashMap<>();
    }

    // Getters //
    private static String getResourceURL() {
        String wd = System.getProperty("user.dir");
        return PROTOCOL + wd + RESOURCES_URL;
    }

    // Behaviour //
    private void loadImage(String key, String url) {
        Image img = new Image(url);
        imageMap.put(key, img);
    }

    // get an item from the database as an imageview
    public ImageView getImageView(String key) {
        Image viewImage = imageMap.get(key);
        return new ImageView(viewImage);
    }

    public void loadData() {
        loadImage(LoadingPane.KEY_TITLE, TITLE_URL);
    }

}
