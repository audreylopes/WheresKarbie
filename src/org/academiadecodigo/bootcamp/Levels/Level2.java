package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level2 extends Level implements Clickable {

    private Picture level2;
    private Picture karbie;
    private Clicker clicker;

    public Level2() {

        clicker = new Clicker(this);
        level2 = new Picture(10,10,"train-station.png");
        karbie = new Picture(454,232,"small-train-station-kim.png");
        level2.draw();
        karbie.draw();
        //this.whenClick();
    }

    @Override
    public void whenClick() {
        if(whenClicked(clicker,karbie)) {
            level2.delete();
            System.out.println("nivel2");
            karbie.delete();
            new Level3();

        }
    }

}
