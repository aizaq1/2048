package info.gridworld.actor;

import java.awt.*;

public class Tile4 extends Actor{
    private int tileValue;
    private boolean newborn;

    public Tile4() {
        tileValue = 4;
        setColor(Color.PINK);
        newborn = true;

    }

    public Tile4(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 4;
        setColor(Color.PINK);
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

