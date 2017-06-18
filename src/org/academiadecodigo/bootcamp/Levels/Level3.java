package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level3 extends Level implements Clickable {

    private Picture level3;
    private Picture kimOnBeach;
    private Clicker clicker;

    public Level3() {

        clicker = new Clicker(this);
        level3 = new Picture(10, 10, "beach.png");
        kimOnBeach = new Picture(224, 540, "small-kim-on-the-beach.png");
        level3.draw();
        kimOnBeach.draw();

    }


    @Override
    public void whenClick() {
        if(whenClicked(clicker,kimOnBeach)) {
            level3.delete();
            System.out.println("nivel3");
            kimOnBeach.delete();
            new Level4();
        }
    }

}
