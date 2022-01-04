/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import javax.swing.*;
import java.util.ArrayList;


/**
 * An <code>ActorWorld</code> is occupied by actors. <br />
 * This class is not tested on the AP CS A and AB exams.
 */

public class ActorWorld extends World<Actor>
{    
    private static final String DEFAULT_MESSAGE = "Click on a grid location to construct or manipulate an actor.";
    private boolean leftup;
    private boolean moved;
    private JFrame myFrame = new JFrame();
    private Grid<Actor> gr = getGrid();
    private int userScore = 0;
    private int userHighScore = 0;
    private boolean firstSession;

    /**
     * Constructs an actor world with a default grid.
     */
    public ActorWorld()
    {
    }

    /**
     * Constructs an actor world with a given grid.
     * @param grid the grid for this world.
     */
    public ActorWorld(Grid<Actor> grid)
    {
        super(grid);
    }

    public void setup(){
        ArrayList<Location> previousOccupied = gr.getOccupiedLocations();
        for (Location a : previousOccupied)
            gr.remove(a);
        add(new Tile());
        firstSession = true;
    }

    public void show()
    {
        if (getMessage() == null)
            setMessage(DEFAULT_MESSAGE);
        super.show();
    }

    public boolean keyPressed(String userInput, Location loc){
        int x = 0, y = 0;
        moved = false;
        boolean canMove = false;
        int direction = 0;
        switch (userInput) {
            case "W":
                y = -1;
                canMove = true;
                leftup = true;
                break;
            case "A":
                x = -1;
                canMove = true;
                direction = 270;
                leftup = true;
                break;
            case "S":
                y = 1;
                canMove = true;
                direction = 180;
                leftup = false;
                break;
            case "D":
                x = 1;
                canMove = true;
                direction = 90;
                leftup = false;
                break;
        }
        setMessage("");
        if (canMove) {
            ArrayList<Location> occupied_original = gr.getOccupiedLocations();
            ArrayList<Location> occupied = new ArrayList<Location>();
            for (Location location : occupied_original) {
                occupied.add(0, location);
            }
            if (leftup) {
                occupied = occupied_original;
            }
            for (Location l : occupied) {
                Actor t = gr.get(l);
                if (t instanceof Tile) {
                    ((Tile) t).setNewborn(false);
                }
                if (t instanceof Tile4) {
                    ((Tile4) t).setNewborn(false);
                }
                if (t instanceof Tile8) {
                    ((Tile8) t).setNewborn(false);
                }
                if (t instanceof Tile16) {
                    ((Tile16) t).setNewborn(false);
                }
                if (t instanceof Tile32) {
                    ((Tile32) t).setNewborn(false);
                }
                if (t instanceof Tile64) {
                    ((Tile64) t).setNewborn(false);
                }
                if (t instanceof Tile128) {
                    ((Tile128) t).setNewborn(false);
                }
                if (t instanceof Tile256) {
                    ((Tile256) t).setNewborn(false);
                }
                if (t instanceof Tile512) {
                    ((Tile512) t).setNewborn(false);
                }
                if (t instanceof Tile1024) {
                    ((Tile1024) t).setNewborn(false);
                }
                if (t instanceof Tile2048) {
                    ((Tile2048) t).setNewborn(false);
                }
            }
            for (Location l : occupied) {
                Actor t = gr.get(l);
                if (t != null) {
                    Location nextLoc = l.getAdjacentLocation(direction);
                    while (gr.isValid(nextLoc) && !(gr.get(nextLoc) instanceof Actor)){
                            t.moveTo(nextLoc);
                            moved = true;
                            nextLoc = new Location(t.getLocation().getRow() + y, t.getLocation().getCol() + x);
                    }
                    //MERGE CODE BELOW//
                    if (t instanceof Tile && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile && !((Tile) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile4 na = new Tile4();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=4;
                        if (firstSession)
                            userHighScore+=4;
                        moved = true;
                   }
                    if (t instanceof Tile4 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile4 && !((Tile4) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile8 na = new Tile8();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=8;
                        if (firstSession)
                            userHighScore+=8;
                        moved = true;
                    }
                    if (t instanceof Tile8 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile8 && !((Tile8) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile16 na = new Tile16();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=16;
                        if (firstSession)
                            userHighScore+=16;
                        moved = true;
                    }
                    if (t instanceof Tile16 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile16 && !((Tile16) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile32 na = new Tile32();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=32;
                        if (firstSession)
                            userHighScore+=32;
                        moved = true;
                    }
                    if (t instanceof Tile32 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile32 && !((Tile32) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile64 na = new Tile64();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=64;
                        if (firstSession)
                            userHighScore+=64;
                        moved = true;
                    }
                    if (t instanceof Tile64 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile64 && !((Tile64) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile128 na = new Tile128();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=128;
                        if (firstSession)
                            userHighScore+=128;
                        moved = true;
                    }
                    if (t instanceof Tile128 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile128 && !((Tile128) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile256 na = new Tile256();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=256;
                        if (firstSession)
                            userHighScore+=256;
                        moved = true;
                    }
                    if (t instanceof Tile256 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile256 && !((Tile256) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile512 na = new Tile512();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=512;
                        if (firstSession)
                            userHighScore+=512;
                        moved = true;
                    }
                    if (t instanceof Tile512 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile512 && !((Tile512) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile1024 na = new Tile1024();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=1024;
                        if (firstSession)
                            userHighScore+=1024;
                        moved = true;
                    }
                    if (t instanceof Tile1024 && gr.isValid(nextLoc) && gr.get(nextLoc) instanceof Tile1024 && !((Tile1024) gr.get(nextLoc)).getNewborn()) {
                        Actor n = gr.get(nextLoc);
                        n.removeSelfFromGrid();
                        Tile2048 na = new Tile2048();
                        na.putSelfInGrid(gr,nextLoc);
                        t.removeSelfFromGrid();
                        userScore+=2048;
                        if (firstSession)
                            userHighScore+=2048;
                        moved = true;
                        userWon();
                    }
                    //MERGE CODE ABOVE//
                }
            }
            if (moved) {
                    Tile a = new Tile();
                    a.putSelfInGrid(gr, getRandomEmptyLocation());
                }

            ArrayList<Location> left = gr.getOccupiedLocations();
            if (left.size() == 16) {
                boolean move_possible = false;
                for (int i = 0; i <left.size() - 1;i++) {
                    if ((i+1)% 4 != 0) {
                        Actor a = gr.get(left.get(i));
                        Actor b = gr.get((left.get(i + 1)));
                        if ((a instanceof Tile && b instanceof Tile)
                                || (a instanceof Tile4 && b instanceof Tile4)
                                || (a instanceof Tile8 && b instanceof Tile8)
                                || (a instanceof Tile16 && b instanceof Tile16)
                                || (a instanceof Tile32 && b instanceof Tile32)
                                || (a instanceof Tile64 && b instanceof Tile64)
                                || (a instanceof Tile128 && b instanceof Tile128)
                                || (a instanceof Tile256 && b instanceof Tile256)
                                || (a instanceof Tile512 && b instanceof Tile512)
                                || (a instanceof Tile1024 && b instanceof Tile1024))
                            move_possible = true;
                    }
                }
                for (int i = 0; i < left.size() - 4;i++) {
                    Actor a = gr.get(left.get(i));
                    Actor b = gr.get((left.get(i + 4)));
                    if ((a instanceof Tile && b instanceof Tile)
                            || (a instanceof Tile4 && b instanceof Tile4)
                            || (a instanceof Tile8 && b instanceof Tile8)
                            || (a instanceof Tile16 && b instanceof Tile16)
                            || (a instanceof Tile32 && b instanceof Tile32)
                            || (a instanceof Tile64 && b instanceof Tile64)
                            || (a instanceof Tile128 && b instanceof Tile128)
                            || (a instanceof Tile256 && b instanceof Tile256)
                            || (a instanceof Tile512 && b instanceof Tile512)
                            || (a instanceof Tile1024 && b instanceof Tile1024))
                        move_possible = true;
                    }
                    if (!move_possible)
                        userLost();
                }
            }
        x = 0;
        y = 0;
        setMessage("Current Score: " + userScore + "\nHigh Score: " + userHighScore);
        return false;
    }

    public void step()
    {
        Grid<Actor> gr = getGrid();
        ArrayList<Actor> actors = new ArrayList<Actor>();
        for (Location loc : gr.getOccupiedLocations())
            actors.add(gr.get(loc));

        for (Actor a : actors)
        {
            // only act if another actor hasn't removed a
            if (a.getGrid() == gr)
                a.act();
        }
    }

    /**
     * Adds an actor to this world at a given location.
     * @param loc the location at which to add the actor
     * @param occupant the actor to add
     */
    public void add(Location loc, Actor occupant)
    {
        occupant.putSelfInGrid(getGrid(), loc);
    }

    /**
     * Adds an occupant at a random empty location.
     * @param occupant the occupant to add
     */
    public void add(Actor occupant)
    {
        Location loc = getRandomEmptyLocation();
        if (loc != null)
            add(loc, occupant);
    }

    /**
     * Removes an actor from this world.
     * @param loc the location from which to remove an actor
     * @return the removed actor, or null if there was no actor at the given
     * location.
     */
    public Actor remove(Location loc)
    {
        Actor occupant = getGrid().get(loc);
        if (occupant == null)
            return null;
        occupant.removeSelfFromGrid();
        return occupant;
    }

    public void userWon(){
        int s = JOptionPane.showConfirmDialog(myFrame, "Nice job. You won! Your score was " + userScore + ". Play again?", "Congratulations!", JOptionPane.YES_NO_OPTION);
        if (s == 0) {
            setup();
            show();
            if (userScore > userHighScore)
                userHighScore = userScore;
            firstSession = false;
            userScore = 0;
        }
        else
            System.exit(0);
    }
    public void userLost(){
        int s = JOptionPane.showConfirmDialog(myFrame, "You lose. Better luck next time! Your score was " + userScore + ". Play again?", ":(", JOptionPane.YES_NO_OPTION);
        if (s == 0) {
            setup();
            show();
            if (userScore > userHighScore)
                userHighScore = userScore;
            firstSession = false;
            userScore = 0;
        }
        else
            System.exit(0);
    }
}