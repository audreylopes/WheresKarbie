package org.academiadecodigo.bootcamp.Levels;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.bootcamp.LevelTypes;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class StartLevel implements KeyboardHandler {


    private Picture startPicture;
    private LevelFactory levelFactory;
    private KeyboardEvent spaceKey;
    private int startPressed = 0;

    /**
     * Creates and draws initial level
     */
    public StartLevel() {
        levelFactory = new LevelFactory();
        startPicture = new Picture(10, 10, "initial-image-1.png");
        startPicture.draw();
        keyboard();
    }

    /**
     * Listens to keyboard events
     *
     * @param keyboardEvent event to be listened
     */
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (startPressed == 0) {
            levelFactory.levelCreator(LevelTypes.LEVEL1);
            this.startPressed++;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    /**
     * Creates keyboard and sets keyboard event
     */
    public void keyboard(){
        Keyboard k = new Keyboard(this);
        spaceKey = new KeyboardEvent();
        spaceKey.setKey(KeyboardEvent.KEY_SPACE);
        spaceKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(spaceKey);
    }
}

