package me.stevenpereira.twentyfortyeight.core;

public class GameBoardFramework {

    /**
     * Adds the specified 'n' number of random tiles to the gameBoard.
     *
     * First checks to make sure there is enough open spaces on the game board
     * before attempting to randomly find spaces and add them.
     *
     * @param gameBoard
     * @param numberOfTiles
     */
    public static void addRandomTiles(int[][] gameBoard, int numberOfTiles) {
        if (getAvailableFreeSpacesCount(gameBoard) >= numberOfTiles) {
            TileGenerator.addRandomTiles(gameBoard, numberOfTiles);
        }
    }

    public static void moveDown(int[][] gameBoard) {
        // Iterate through each column
        for (int i = 0; i < gameBoard.length; i++) {

            // First need to remove spaces by shifting down
            shiftDown(gameBoard, i);

            // Iterate through the individual column starting at the bottom
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

            // Iterate through the individual column starting at the bottom
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

            // Iterate through the individual column starting at the bottom
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

            // Iterate through the individual column starting at the bottom
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

    /**
     * Checks whether the gameBoard is full, meaning every
     * available space has a tile already there.
     *
     * Note that the gameBoard being full is not the same as
     * having an 'available move'.
     *
     * @param gameBoard
     * @return
     */
    public static boolean isGameBoardFull(int[][] gameBoard) {
        return getAvailableFreeSpacesCount(gameBoard) < 1;
    }

    /**
     * Scans the gameBoard and returns the number of available
     * free spaces.
     * @param gameBoard
     * @return Count of available free spaces.
     */
    public static int getAvailableFreeSpacesCount(int[][] gameBoard) {
        if (gameBoard == null) {
            return 0;
        }

        int freeSpaceCount = 0;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == 0) {
                    freeSpaceCount++;
                }
            }
        }

        return freeSpaceCount;
    }

    /**
     * Checks to see if there's any moves to be made, so that we can
     * figure out if it's game over.
     * @param gameBoard
     * @return
     */
    public static boolean isMoveAvailable(int[][] gameBoard) {
        // TODO - Still needs an implementation
        // Check Horizontal Moves



        // Check Vertical Moves


        return true;
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
