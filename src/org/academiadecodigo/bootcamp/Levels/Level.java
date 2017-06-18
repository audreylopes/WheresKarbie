package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level {

    public final int PADDING = 10;

    /**
     * Returns a boolean if the clicker position matches the picture position
     *
     * @param clicker allow position check
     * @param picture allow picture position check
     * @return boolean
     */
    public boolean whenClicked(Clicker clicker, Picture picture) {
        if (clicker.getMouseX() >= picture.getX() &&
                clicker.getMouseX() <= picture.getMaxX() &&
                clicker.getMouseY() >= picture.getY() &&
                clicker.getMouseY() <= picture.getMaxY()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Deletes the pictures drawn
     *
     * @param picture picture drawn
     * @param picture2 picture drawn
     */
    public void deletePicture(Picture picture, Picture picture2){
        picture.delete();
        picture2.delete();

    }


}