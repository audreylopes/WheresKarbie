package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.bootcamp.LevelTypes;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level3 extends Level implements Clickable {


    private LevelFactory levelFactory;
    private Picture level3;
    private Picture kimOnBeach;
    private Clicker clicker;
    private Picture easterEgg;

    /**
     * Creates and draws pictures
     */
    public Level3() {
        levelFactory = new LevelFactory();
        clicker = new Clicker(this);
        level3 = new Picture(10, 10, "beach.png");
        kimOnBeach = new Picture(224, 540, "small-kim-on-the-beach.png");
        easterEgg = new Picture(529, 296, "small-museum-kim.png");
        level3.draw();
        kimOnBeach.draw();
    }

    /**
     * @see Clickable
     * Creates next level or bonus level
     */
    @Override
    public void whenClick() {
        if (whenClicked(clicker, kimOnBeach)) {
            deletePicture(level3, kimOnBeach);
            levelFactory.levelCreator(LevelTypes.LEVEL4);
        }
        if (whenClicked(clicker, easterEgg)) {
            deletePicture(level3, kimOnBeach);
            levelFactory.levelCreator(LevelTypes.EASTEREGG);
        }
    }
}
