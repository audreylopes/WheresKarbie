package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level {

    public final int PADDING = 10;

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

    public void deletePicture(Picture picture, Picture picture2){
        picture.delete();
        picture2.delete();

    }


}