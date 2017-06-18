package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.bootcamp.LevelTypes;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level1 extends Level implements Clickable {


    private LevelFactory levelFactory;
    private Clicker clicker;
    private Picture level1;
    private Picture kim;

    /**
     * Creates and draws pictures
     */
    public Level1() {
        levelFactory = new LevelFactory();
        clicker = new Clicker(this);
        level1 = new Picture(10, 10, "museum.png");
        kim = new Picture(728, 268, "small-museum-kim.png");
        level1.draw();
        kim.draw();
    }

    /**
     * @see Clickable
     * Creates next level
     */
    @Override
    public void whenClick() {
        if (whenClicked(clicker, kim)) {
            deletePicture(level1, kim);
            levelFactory.levelCreator(LevelTypes.LEVEL2);
        }
    }
}
