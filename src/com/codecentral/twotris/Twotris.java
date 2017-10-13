package com.codecentral.twotris;

/**
 * The primary entry point to 2tris.
 *
 * @author willieechalmers@gmail.com
 * @version 0.1.0
 * @since 10/1/17
 */
public class Twotris {

	private Renderer render;

    /**
     * Starts a new instance of the game.
     *
     * @param args Command line arguments, currently ignored
     */
    public static void main(String[] args) {
        // TODO: 10/1/17 Implement me
       startNewGame();
    }

    public static void startNewGame() {
    	new Twotris().startGame();
    }

    private Twotris() {
    	// TODO: Initialize variables
    }

    public void startGame() {
    	startGame(null);
    }

    public void startGame(String[] args) {
    	if (args != null) {
    		// Handle args
    	}
    }

    public static class Player {
    	private int points;
    }

    public static class Tetromino {

    	/**
    	 * A two-dimensional integer array representing color values
    	 * A value of -1 indicates there should be no display for that component.
    	 */
    	private int[][] components;

    	/**
    	 * Creates a new Tetromino with the display
    	 */
    	public Tetromino(int[][] componentDefinition) {
    		components = componentDefinition;
    	}

    	private void validateComponentDefinition(int[][] componentDefinition) {
    		if (true) {
    			// TODO: Make sure RGB values are valid and the component isn't larger than the game.
    			return;
    		}
    		throw new IllegalArgumentException("Component definition");
    	}

        public void rotate(Direction direction) {
            if (direction == Direction.CLOCKWISE) {
                // TODO: Do something with components
            } else if (direction == Direction.COUNTER_CLOCKWISE) {
                // TODO: Do something with components
            }
        }
    }

    public enum Direction {
        CLOCKWISE, COUNTER_CLOCKWISE
    }
}

class pointsTracker
{
	private static int points;
	public static int levels(int lines, int level)
	{
		int points;
		if (line == 1)
		{
			points = 40 * (level + 1);
		}
		if (line == 2)
		{
			points = 80 * (level + 1);
		}
		if (line == 3)
		{
			points = 120 * (level + 1);
		}
		if (line == 4)
		{
			points = 160 * (level + 1);
		}
		if (line == 5)
		{
			points = 200 * (level + 1);
		}
		if (line == 6)
		{
			points = 240 * (level + 1);
		}
		if (line == 7)
		{
			points = 280 * (level + 1);
		}
		if (line == 8)
		{
			points = 320 * (level + 1);
		}

		return 	points;
	}
}
