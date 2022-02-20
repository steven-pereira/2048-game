package me.stevenpereira.twentyfortyeight.core;

import java.util.Random;

import static me.stevenpereira.twentyfortyeight.core.GameConfiguration.POSSIBLE_TILE_SIZES;

public class TileGenerator {

    /**
     * Utility method to add N number of random tiles to the board.
     *
     * TODO: Currently keeps going if it doesn't find an open space
     * TODO: Needs to not check if there's no open spaces
     * @param gameBoard
     * @param numberOfTiles
     */
    public static void addRandomTiles(int[][] gameBoard, int numberOfTiles) {
        Random random = new Random();
        boolean uniqueTilesSet = false;

        if (numberOfTiles > 0) {
            for (int i = 0; i < numberOfTiles || uniqueTilesSet; i++) {
                // Find random x position
                int xPosition = random.nextInt(gameBoard.length);

                // Find random y position
                int yPosition = random.nextInt(gameBoard.length);

                // Find random tile Number - needs to be based on level TODO - level context
                int tileValue = POSSIBLE_TILE_SIZES[random.nextInt(2)];

                if (gameBoard[xPosition][yPosition] != 0) {
                    uniqueTilesSet = true;
                } else {
                    // Set tile
                    gameBoard[xPosition][yPosition] = tileValue;
                    uniqueTilesSet = false;
                }
            }
        }
    }

}
