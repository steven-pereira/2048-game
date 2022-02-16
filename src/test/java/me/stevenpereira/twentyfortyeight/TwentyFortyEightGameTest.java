package me.stevenpereira.twentyfortyeight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwentyFortyEightGameTest {

    private TwentyFortyEightGame twentyFortyEightGame;

    @Before
    public void setUp() {
        this.twentyFortyEightGame = new TwentyFortyEightGame();
    }

    @Test
    public void testShiftDownWithLeadingSpace() {
        int[][] testGameBoard = new int[][] {
                {0, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftDown(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{2, 2, 0, 0};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftDownWithTrailingSpace() {
        int[][] testGameBoard = new int[][] {
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftDown(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{2, 2, 2, 0};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftDownWithSpaceInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 2, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftDown(testGameBoard, 0);

        int[] expectedColumn = new int[]{2, 2, 2, 0};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftDownWithSpacesInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 0, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftDown(testGameBoard, 0);

        int[] expectedColumn = new int[]{2, 2, 0, 0};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithLeadingSpace() {
        int[][] testGameBoard = new int[][] {
                {0, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftUp(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{0, 0, 2, 2};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithTrailingSpace() {
        int[][] testGameBoard = new int[][] {
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftUp(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{0, 2, 2, 2};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithSpaceInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 2, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftUp(testGameBoard, 0);

        int[] expectedColumn = new int[]{0, 2, 2, 2};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithSpacesInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 0, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        this.twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftUp(testGameBoard, 0);

        int[] expectedColumn = new int[]{0, 0, 2, 2};
        assertArrayEquals(this.twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }
}
