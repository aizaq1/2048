Names: Sebastian Beurnier, Qazi Ashikin, Anthony Jiang
AP CS A Final Project

Introduction:
We have made a version of the game 2048 using GridWorld. Players may combine tiles with the same number to create tiles with larger numbers. The goal of the game is to create a tile with the number 2048 using the specified hotkeys (see below). There is a scoreboard, much like the one in the actual game that records your current score and your highest score.

Directions:
1. Enter the "src" file directory after extracting the .zip file. Run the Main.java file. Everything should already be compiled, so this is all that will be necessary.
2. Use the W, A, S, and D keys to control the tiles. W will push the tiles up, A to the left, S downward, and D to the right.
3. At the end of the game, whether you win or lose, there will be an option to play again.

A couple notes:
1. The "out" folder contains all of the .class files (as produced by IntelliJ).
2. Most of our code is written in the ActorWorld.java file under src/info/gridworld/Actor
3. Line 104 in ActorWorld.java might seem unnecessary. It was written to avoid a bug in the program in which the final move of the game (right before the game prompts you to select whether or not you would like to play again) was not shown on the screen.
4. We hope you enjoy our game - we had fun making it.

