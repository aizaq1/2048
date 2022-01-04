package info.gridworld.actor;

import java.awt.*;

public class Tile256 extends Actor{
    private int tileValue;
    private boolean newborn;
    public Tile256() {
        tileValue = 256;
        setColor(Color.MAGENTA);
        newborn = true;
    }

    public Tile256(int value) {
        if (value <= 2048)
            tileValue = value;
        else
            tileValue = 256;
        setColor(Color.MAGENTA);
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
