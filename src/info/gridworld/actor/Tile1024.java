package info.gridworld.actor;

import java.awt.*;

public class Tile1024 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile1024() {
        tileValue = 1024;
        setColor(Color.YELLOW);
        newborn = true;
    }

    public Tile1024(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 1024;
        setColor(Color.YELLOW);
    }

    public int getTileValue(){
        return tileValue;
    }
    public void doubleValue() {
        tileValue *= 2;
    }
    public void act(){
    }
    public boolean getNewborn() {
        return newborn;
    }
    public void setNewborn(boolean born) {
        newborn = born;
    }
}
