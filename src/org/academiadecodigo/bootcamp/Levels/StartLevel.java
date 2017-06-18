package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.bootcamp.LevelTypes;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class StartLevel implements KeyboardHandler{


    private Picture startPicture;
    private LevelFactory levelFactory;
    private KeyboardEvent spaceKey;
    private Text startText;
    private int  startPressed = 1;
    public StartLevel() {
        levelFactory = new LevelFactory();
        startPicture = new Picture(10,10, "wheres-karbies.png");
        startText = new Text(500,500,"Press Space to start");
        startText.grow(50,50);
        startText.setColor(Color.BLUE);
        startPicture.draw();
        startText.draw();
        Keyboard k = new Keyboard(this);
       spaceKey = new KeyboardEvent();
       spaceKey.setKey(KeyboardEvent.KEY_SPACE);
       spaceKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

       k.addEventListener(spaceKey);
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
       if(startPressed == 1) {
           levelFactory.levelCreator(LevelTypes.LEVEL1);
           this.startPressed++;
       }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
