package info.gridworld.actor;

import java.awt.*;

public class Tile16 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile16() {
        tileValue = 16;
        setColor(Color.GREEN);
        newborn = true;
    }

    public Tile16(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 16;
        setColor(Color.GREEN);
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

