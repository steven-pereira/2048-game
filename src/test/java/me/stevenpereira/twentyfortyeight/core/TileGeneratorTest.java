package me.stevenpereira.twentyfortyeight.core;

import me.stevenpereira.twentyfortyeight.testing.GameBoardTestMocks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TileGeneratorTest {

    @Test
    public void addRandomTilesOnEmptyBoardTest() {
        int[][] gameBoard = new GameBoardTestMocks().GAME_BOARD_EMPTY;

        TileGenerator.addRandomTiles(gameBoard, 2);

        int expectedTilesFound = 2;
        int actualTilesFound = 0;

        // Assert there are two tiles on the board
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] != 0) {
                    actualTilesFound++;
                }
            }
        }

        assertEquals(expectedTilesFound, actualTilesFound);
    }

    @Test
    public void addRandomTileOnFullBoardTest() {
        int[][] gameBoard = new GameBoardTestMocks().GAME_BOARD_FULL_NO_MOVES;

        TileGenerator.addRandomTiles(gameBoard, 1);


    }
}
