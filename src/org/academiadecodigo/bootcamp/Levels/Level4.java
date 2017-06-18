package org.academiadecodigo.bootcamp.Levels;
import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level4 extends Level implements Clickable {


    private Picture level4;
    private Clicker clicker;

    /**
     * Creates and draws pictures
     */
    public Level4() {
        level4 = new Picture(10, 10, "game-over.png");
        clicker = new Clicker(this);
        level4.draw();
    }

    /**
     * @see Clickable
     * Exits game
     */
    @Override
    public void whenClick() {
        if (whenClicked(clicker, level4)) {
            System.exit(0);
        }
    }
}
