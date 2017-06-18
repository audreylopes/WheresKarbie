package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class EasterEgg extends Level implements Clickable {


    private Picture picture;
    private Clicker clicker;

    /**
     * Creates and draws picture
     */
    public EasterEgg() {
        clicker = new Clicker(this);
        picture = new Picture(10, 10, "master-coders.png");
        picture.draw();
    }

    /**
     * @see Clickable
     * Exits game
     */
    @Override
    public void whenClick() {
        if (whenClicked(clicker, picture)) {
            System.exit(0);
        }
    }
}
