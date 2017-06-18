package org.academiadecodigo.bootcamp;
import org.academiadecodigo.bootcamp.Levels.*;

/**
 * Created by codecadet on 18/06/17.
 */
public class LevelFactory {

    /**
     * Creates Levels
     *
     * @param levelTypes Enum with level types
     *
     */
    public void levelCreator(LevelTypes levelTypes) {

        switch (levelTypes) {
            case START:
                new StartLevel();
                break;
            case LEVEL1:
                new Level1();
                break;
            case LEVEL2:
                new Level2();
                break;
            case LEVEL3:
                new Level3();
                break;
            case LEVEL4:
                new Level4();
                break;
            case EASTEREGG:
                new EasterEgg();
                break;
        }
    }
}
