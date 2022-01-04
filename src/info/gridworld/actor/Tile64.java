package info.gridworld.actor;

import java.awt.*;

public class Tile64 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile64() {
        tileValue = 64;
        setColor(Color.BLUE);
        newborn = true;
    }

    public Tile64(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 64;
        setColor(Color.BLUE);
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

