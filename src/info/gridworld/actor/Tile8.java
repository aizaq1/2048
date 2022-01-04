package info.gridworld.actor;

import java.awt.*;

public class Tile8 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile8() {
        tileValue = 8;
        setColor(Color.RED);
        newborn = true;
    }

    public Tile8(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 8;
        setColor(Color.RED);
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

