package info.gridworld.actor;

import java.awt.*;

public class Tile128 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile128() {
        tileValue = 128;
        setColor(Color.DARK_GRAY);
        newborn = true;
    }

    public Tile128(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 128;
        setColor(Color.DARK_GRAY);
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
