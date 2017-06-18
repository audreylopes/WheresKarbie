package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 18/06/17.
 */
public class Clicker implements MouseHandler{

    private Clickable c;


    //private Position position;
    private int mouseX;
    private int mouseY;

    public Clicker(Clickable clickable) {
        c = clickable;
        //position = new Position();
        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);

    }

    public int getMouseX() {
        return this.mouseX;
    }
    public int getMouseY() {
        return this.mouseY;

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.mouseX = (int) mouseEvent.getX();
        this.mouseY = (int) mouseEvent.getY();
        c.whenClick();
        System.out.println(this.mouseX);
        System.out.println(this.mouseY);


    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

}
