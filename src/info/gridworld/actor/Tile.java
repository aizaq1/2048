package info.gridworld.actor;

import java.awt.*;

public class Tile extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile() {
        tileValue = 2;
        setColor(Color.ORANGE);
        newborn = true;
    }

    public Tile(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 2;
        setColor(Color.ORANGE);
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
