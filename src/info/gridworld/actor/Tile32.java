package info.gridworld.actor;

import java.awt.*;

public class Tile32 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile32() {
        tileValue = 32;
        setColor(Color.CYAN);
        newborn = true;

    }

    public Tile32(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 32;
        setColor(Color.CYAN);
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

