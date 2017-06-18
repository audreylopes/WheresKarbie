package org.academiadecodigo.bootcamp.Levels;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.LevelFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/06/17.
 */
public class Level4 extends Level {

    private Picture level4;

    //private Clicker clicker;

    public Level4() {

        level4 = new Picture(10, 10, "f780e0891450c8aeaa49bb798c417341.jpg");

        //clicker = new Clicker(this);
        level4.draw();
        System.out.println("gameover");

    }
}
