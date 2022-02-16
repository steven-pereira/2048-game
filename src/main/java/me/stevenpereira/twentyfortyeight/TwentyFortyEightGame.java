package me.stevenpereira.twentyfortyeight;

import me.stevenpereira.twentyfortyeight.core.GameBoardFramework;

/**
 * 2048 Game
 */
public class TwentyFortyEightGame {

    /** Move Direction Enum */
    enum MoveDirection {UP, DOWN, RIGHT, LEFT};

    /** Game Status Enum */
    enum GameStatus {ACTIVE, WON, LOSS};

    /** Grid Size Constant - Drives Creation Size */
    public static final int BOARD_SIZE = 4;

    /** Game board state */
    private int[][] gameBoard = new int[BOARD_SIZE][BOARD_SIZE];

    /** Game Status State */
    private GameStatus gameStatus;

    /**
     * Default Game Constructor. Generates 2 random tiles to start
     *
     * Sets game status to 'Active'.
     */
    public TwentyFortyEightGame() {
        // Initialize board with 2 tiles
        GameBoardFramework.addRandomTiles(gameBoard, 2);

        // Initialize game status to 'Active'
        gameStatus = GameStatus.ACTIVE;
    }

    /**
     * Alternate Game Constructor which allows an initial game
     * board state to passed.
     *
     * @param initialStateGameBoard
     */
    public TwentyFortyEightGame(int[][] initialStateGameBoard) {
        // Set the initial game
        this.gameBoard = initialStateGameBoard;

        // Initialize game status to 'Active'
        gameStatus = GameStatus.ACTIVE;
    }

    /**
     * Getter method for the internal Game Board state.
     *
     * @return Game Board State represented as 2 dimensional array
     */
    public int[][] getGameBoard() {
        return this.gameBoard;
    }

    /**
     * Getter method for the internal Game Status state.
     *
     * @return Game board state enum.
     */
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    /**
     * Checks to see if there's any moves to be made, so that we can
     * figure out if it's game over.
     * @param gameBoard
     * @return
     */
    public boolean isMoveAvailable(int[][] gameBoard) {
        //TODO


        return true;
    }

    public void move(int[][] gameBoard, MoveDirection moveDirection) {

        switch (moveDirection) {
            case DOWN:
                GameBoardFramework.moveDown(gameBoard);
                break;
            case UP:
                GameBoardFramework.moveUp(gameBoard);
                break;
            case LEFT:
                GameBoardFramework.moveLeft(gameBoard);
                break;
            case RIGHT:
                GameBoardFramework.moveRight(gameBoard);
                break;
        }

        // Add one more random tile
        GameBoardFramework.addRandomTiles(this.getGameBoard(), 1);
    }


    public void printGameBoard(int[][] gameBoard) {
       if (gameBoard != null) {
           GameBoardFramework.printGameBoard(gameBoard);
       }
    }
}
