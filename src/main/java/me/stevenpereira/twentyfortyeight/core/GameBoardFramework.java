package me.stevenpereira.twentyfortyeight.core;

import java.util.Random;

public class GameBoardFramework {

    /** Possible tile sizes - used for random value generator */
    public static final int[] POSSIBLE_TILE_SIZES = new int[]{2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

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
                    continue;
                } else {
                    // Set tile
                    gameBoard[xPosition][yPosition] = tileValue;
                    uniqueTilesSet = false;
                }
            }
        }
    }

    public static void moveDown(int[][] gameBoard) {
        // Iterate through each column
        for (int i = 0; i < gameBoard.length; i++) {

            // First need to remove spaces by shifting down
            shiftDown(gameBoard, i);

            // Iterate through the indiviual column starting at the bottom
            for (int j = 0; j < gameBoard[i].length - 1; j++) {
                int tileValue1 = gameBoard[i][j];
                int tileValue2 = gameBoard[i][j + 1];

                // Check if touching matching tiles
                if (tileValue1 == tileValue2 && tileValue1 != 0 && tileValue2 != 0) {
                    // Set bottom tile to value * 2
                    gameBoard[i][j] = tileValue1 + tileValue2;
                    gameBoard[i][j + 1] = 0;
                }
            }

            // Remove any spaces caused by tile matches
            shiftDown(gameBoard, i);
        }
    }

    public static void moveUp(int[][] gameBoard) {
        // Iterate through each column
        for (int i = 0; i < gameBoard.length; i++) {

            // First need to remove spaces by shifting down
            shiftUp(gameBoard, i);

            // Iterate through the indiviual column starting at the bottom
            for (int j = gameBoard[i].length - 1; j > 0; j--) {
                int tileValue1 = gameBoard[i][j];
                int tileValue2 = gameBoard[i][j - 1];

                // Check if touching matching tiles
                if (tileValue1 == tileValue2 && tileValue1 != 0 && tileValue2 != 0) {
                    // Set bottom tile to value * 2
                    gameBoard[i][j] = tileValue1 + tileValue2;
                    gameBoard[i][j - 1] = 0;
                }
            }

            // Remove any spaces caused by tile matches
            shiftUp(gameBoard, i);
        }
    }

    public static void moveLeft(int[][] gameBoard) {
        // Iterate through each column
        for (int i = 0; i < gameBoard.length; i++) {

            // First need to remove spaces by shifting down
            shiftLeft(gameBoard, i);

            // Iterate through the indiviual column starting at the bottom
            for (int j = 0; j < gameBoard[i].length - 1; j++) {
                int tileValue1 = gameBoard[j][i];
                int tileValue2 = gameBoard[j + 1][i];

                // Check if touching matching tiles
                if (tileValue1 == tileValue2 && tileValue1 != 0 && tileValue2 != 0) {
                    // Set bottom tile to value * 2
                    gameBoard[j][i] = tileValue1 + tileValue2;
                    gameBoard[j + 1][i] = 0;
                }
            }

            // Remove any spaces caused by tile matches
            shiftLeft(gameBoard, i);
        }
    }

    public static void moveRight(int[][] gameBoard) {
        // Iterate through each column
        for (int i = 0; i < gameBoard.length; i++) {

            // First need to remove spaces by shifting down
            shiftRight(gameBoard, i);

            // Iterate through the indiviual column starting at the bottom
            for (int j = gameBoard[i].length - 1; j > 0; j--) {
                int tileValue1 = gameBoard[j][i];
                int tileValue2 = gameBoard[j - 1][i];

                // Check if touching matching tiles
                if (tileValue1 == tileValue2 && tileValue1 != 0 && tileValue2 != 0) {
                    // Set bottom tile to value * 2
                    gameBoard[j][i] = tileValue1 + tileValue2;
                    gameBoard[j - 1][i] = 0;
                }
            }

            // Remove any spaces caused by tile matches
            shiftRight(gameBoard, i);
        }
    }

    public static void shiftRight(int[][] gameBoard, int yRowIndex) {
        int emptyTileIndex = -1;

        for (int xColumnX = gameBoard.length - 1; xColumnX >= 0; xColumnX--) {

            if (gameBoard[xColumnX][yRowIndex] == 0 && emptyTileIndex < 0) {
                emptyTileIndex = xColumnX;
            }

            if (gameBoard[xColumnX][yRowIndex] != 0) {

                if (emptyTileIndex >= 0) {
                    gameBoard[emptyTileIndex][yRowIndex] = gameBoard[xColumnX][yRowIndex];
                    gameBoard[xColumnX][yRowIndex] = 0;
                    emptyTileIndex--;
                }
            }
        }
    }


    public static void shiftLeft(int[][] gameBoard, int yRowIndex) {
        int emptyTileIndex = -1;

        for (int xColumnX = 0; xColumnX < gameBoard[yRowIndex].length; xColumnX++) {

            if (gameBoard[xColumnX][yRowIndex] == 0 && emptyTileIndex < 0) {
                emptyTileIndex = xColumnX;
            }

            if (gameBoard[xColumnX][yRowIndex] != 0) {

                if (emptyTileIndex >= 0) {
                    gameBoard[emptyTileIndex][yRowIndex] = gameBoard[xColumnX][yRowIndex];
                    gameBoard[xColumnX][yRowIndex] = 0;
                    emptyTileIndex++;
                }
            }
        }
    }


    public static void shiftDown(int[][] gameBoard, int xColumnIndex) {
        int emptyTileIndex = -1;

        for (int yRowIndex = 0; yRowIndex < gameBoard[xColumnIndex].length; yRowIndex++) {

            if (gameBoard[xColumnIndex][yRowIndex] == 0 && emptyTileIndex < 0) {
                emptyTileIndex = yRowIndex;
            }

            if (gameBoard[xColumnIndex][yRowIndex] != 0) {

                if (emptyTileIndex >= 0) {
                    gameBoard[xColumnIndex][emptyTileIndex] = gameBoard[xColumnIndex][yRowIndex];
                    gameBoard[xColumnIndex][yRowIndex] = 0;
                    emptyTileIndex++;
                }
            }
        }
    }

    public static void shiftUp(int[][] gameBoard, int xColumnIndex) {
        int emptyTileIndex = -1;

        for (int yRowIndex = gameBoard.length - 1; yRowIndex >= 0; yRowIndex--) {

            if (gameBoard[xColumnIndex][yRowIndex] == 0 && emptyTileIndex < 0) {
                emptyTileIndex = yRowIndex;
            }

            if (gameBoard[xColumnIndex][yRowIndex] != 0) {

                if (emptyTileIndex >= 0) {
                    gameBoard[xColumnIndex][emptyTileIndex] = gameBoard[xColumnIndex][yRowIndex];
                    gameBoard[xColumnIndex][yRowIndex] = 0;
                    emptyTileIndex--;
                }
            }
        }
    }

    public static void printGameBoard(int[][] gameBoard) {
        for (int j = gameBoard.length - 1; j >= 0; j--) {

            for (int i = 0; i < gameBoard[j].length; i++) {

                System.out.print(gameBoard[i][j] + " ");
            }
            // Next line
            System.out.println();
        }
    }
}
