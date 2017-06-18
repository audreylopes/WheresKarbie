package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.bootcamp.LevelTypes;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level2 extends Level implements Clickable {

    private LevelFactory levelFactory;
    private Picture level2;
    private Picture karbie;
    private Clicker clicker;

    public Level2() {

        levelFactory = new LevelFactory();
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
            deletePicture(level2,karbie);

            System.out.println("nivel2");
            levelFactory.levelCreator(LevelTypes.LEVEL3);
        } else {
            return;

        }
    }

}
