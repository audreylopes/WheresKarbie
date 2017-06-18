package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class StartLevel extends Level implements Clickable {

    private Picture startPicture;
    private Clicker clicker;

    public StartLevel() {

        startPicture = new Picture(PADDING, PADDING, "wheres-karbies.png");
        clicker = new Clicker(this);
        startPicture.draw();
        this.whenClick();
    }

    @Override
    public void whenClick() {
        if (whenClicked(clicker, startPicture)) {
            startPicture.delete();
            new Level1();

        }
    }
}
