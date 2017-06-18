package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.bootcamp.LevelTypes;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class StartLevel extends Level implements Clickable {

    private Picture startPicture;
    private Picture startButton;
    private Clicker clicker;
    private LevelFactory levelFactory;

    public StartLevel() {
        levelFactory = new LevelFactory();
        startPicture = new Picture(PADDING, PADDING, "wheres-karbies.png");
        startButton = new Picture(600,600,"PauseButton.png");
        clicker = new Clicker(this);
        startPicture.draw();
        startButton.draw();
        this.whenClick();
    }

    @Override
    public void whenClick() {
        if (whenClicked(clicker, startButton)) {
            deletePicture(startButton,startPicture);
            levelFactory.levelCreator(LevelTypes.LEVEL1);
        }
    }
}
