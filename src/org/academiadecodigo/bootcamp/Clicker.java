package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 18/06/17.
 */
public class Clicker implements MouseHandler {

    /**
     * Implements MouseHandler methods to allow mouse actions
     *
     */

    private Clickable c;
    private int mouseX;
    private int mouseY;

    /**
     * Creates clicker
     *
     * @param clickable to implement Clickable methods
     */
    public Clicker(Clickable clickable) {
        c = clickable;
        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);
    }

    /**
     * Returns the X value from the mouse when clicked
     *
     * @return the X value
     */
    public int getMouseX() {
        return this.mouseX;
    }

    /**
     * Returns the Y value from the mouse when clicked
     *
     * @return the Y value
     */
    public int getMouseY() {
        return this.mouseY;
    }

    /**
     * Listens to the mouse event
     *
     * @param mouseEvent the mouse event
     */
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
