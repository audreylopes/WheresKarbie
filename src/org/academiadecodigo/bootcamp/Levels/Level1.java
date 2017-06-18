package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level1 extends Level implements Clickable {

    private Clicker clicker;
    private Picture level1;
    private Picture kim;

    public Level1() {

        clicker = new Clicker(this);
        level1 = new Picture(10, 10, "museum.png");
        kim = new Picture(728, 268, "small-museum-kim.png");
        level1.draw();
        kim.draw();
        //this.whenClick();
    }

    @Override
    public void whenClick() {
        if (whenClicked(clicker, kim)) {
            level1.delete();
            System.out.println("nivel1");
            kim.delete();
            new Level2();
        }

    }
}
