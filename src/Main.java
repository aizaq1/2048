import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Tile;

public class Main {
    public static void main (String[] args) {
        ActorWorld world = new ActorWorld();
        world.setMessage("Hello! Welcome to 2048.\nPress W, A, S or D to move the tiles. Get to 2048 to win!");
        world.setup();
        world.show();
    }
}