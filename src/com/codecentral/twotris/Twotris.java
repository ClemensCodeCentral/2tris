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
    	new Twotris().startGame()
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

    public static class Tetroid {

    	/**
    	 * A two-dimensional integer array representing color values
    	 * A value of -1 indicates there should be no display for that component.
    	 */
    	private int[][] components;

    	/**
    	 * Creates a new Tetroid with the display
    	 */
    	public Tetroid(int[][] componentDefinition) {
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
