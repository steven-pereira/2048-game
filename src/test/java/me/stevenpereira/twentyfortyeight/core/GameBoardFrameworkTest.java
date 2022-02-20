package me.stevenpereira.twentyfortyeight.core;

import me.stevenpereira.twentyfortyeight.TwentyFortyEightGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GameBoardFrameworkTest {

    @Before
    public void setup() {

    }

    @Test
    public void moveDownTest1() {

        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 4, 0, 16},
                {4, 2, 2, 8},
                {8, 2, 2, 8},
                {8, 4, 4, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {8, 16, 0, 0},
                {4, 4, 8, 0},
                {8, 4, 8, 0},
                {8, 8, 0, 0}
        };

        GameBoardFramework.moveDown(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveDownTest2() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 8, 8, 4},
                {0, 8, 8, 2},
                {2, 0, 4, 4},
                {8, 8, 0, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {4, 16, 4, 0},
                {16, 2, 0, 0},
                {2, 8, 0, 0},
                {16, 0, 0, 0}
        };

        GameBoardFramework.moveDown(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveDownTest3() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {0, 0, 2, 2},
                {0, 2, 4, 2},
                {2, 0, 0, 4},
                {8, 0, 0, 8}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {4, 0, 0, 0},
                {2, 4, 2, 0},
                {2, 4, 0, 0},
                {16, 0, 0, 0}
        };

        GameBoardFramework.moveDown(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveDownTest4() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {128, 128, 128, 128},
                {256, 256, 256, 256},
                {512, 512, 512, 512},
                {1024, 1024, 1024, 1024}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {256, 256, 0, 0},
                {512, 512, 0, 0},
                {1024, 1024, 0, 0},
                {2048, 2048, 0, 0}
        };

        GameBoardFramework.moveDown(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveUpTest1() {

        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 4, 0, 16},
                {4, 2, 2, 8},
                {8, 2, 2, 8},
                {8, 4, 4, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 8, 16},
                {0, 4, 4, 8},
                {0, 8, 4, 8},
                {0, 0, 8, 8}
        };

        GameBoardFramework.moveUp(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveUpTest2() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 8, 8, 4},
                {0, 8, 8, 2},
                {2, 0, 4, 4},
                {8, 8, 0, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 4, 16, 4},
                {0, 0, 16, 2},
                {0, 0, 2, 8},
                {0, 0, 0, 16}
        };

        GameBoardFramework.moveUp(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveUpTest3() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {0, 0, 2, 2},
                {0, 2, 4, 2},
                {2, 0, 0, 4},
                {8, 0, 0, 8}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 0, 4},
                {0, 2, 4, 2},
                {0, 0, 2, 4},
                {0, 0, 0, 16}
        };

        GameBoardFramework.moveUp(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveUpTest4() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {128, 128, 128, 128},
                {256, 256, 256, 256},
                {512, 512, 512, 512},
                {1024, 1024, 1024, 1024}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 256, 256},
                {0, 0, 512, 512},
                {0, 0, 1024, 1024},
                {0, 0, 2048, 2048}
        };

        GameBoardFramework.moveUp(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveRightTest1() {

        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 4, 0, 16},
                {4, 2, 2, 8},
                {8, 2, 2, 8},
                {8, 4, 4, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 0, 0},
                {0, 4, 0, 0},
                {8, 4, 4, 16},
                {16, 4, 4, 16}
        };

        GameBoardFramework.moveRight(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveRightTest2() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 8, 8, 4},
                {0, 8, 8, 2},
                {2, 0, 4, 4},
                {8, 8, 0, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 0, 0},
                {4, 0, 0, 4},
                {2, 8, 16, 2},
                {8, 16, 4, 4}
        };

        GameBoardFramework.moveRight(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveRightTest3() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {0, 0, 2, 2},
                {0, 2, 4, 2},
                {2, 0, 0, 4},
                {8, 0, 0, 8}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 4},
                {2, 0, 2, 4},
                {8, 2, 4, 8}
        };

        GameBoardFramework.moveRight(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveRightTest4() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {64, 128, 256, 512},
                {64, 128, 256, 512},
                {128, 256, 512, 1024},
                {128, 256, 512, 1024}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {128, 256, 512, 1024},
                {256, 512, 1024, 2048}
        };

        GameBoardFramework.moveRight(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveLeftTest1() {

        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 4, 0, 16},
                {4, 2, 2, 8},
                {8, 2, 2, 8},
                {8, 4, 4, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {8, 4, 4, 16},
                {16, 4, 4, 16},
                {0, 4, 0, 0},
                {0, 0, 0, 0}
        };

        GameBoardFramework.moveLeft(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveLeftTest2() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {4, 8, 8, 4},
                {0, 8, 8, 2},
                {2, 0, 4, 4},
                {8, 8, 0, 0}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {4, 16, 16, 4},
                {2, 8, 4, 2},
                {8, 0, 0, 4},
                {0, 0, 0, 0}
        };

        GameBoardFramework.moveLeft(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveLeftTest3() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {0, 0, 2, 2},
                {0, 2, 4, 2},
                {2, 0, 0, 4},
                {8, 0, 0, 8}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {2, 2, 2, 4},
                {8, 0, 4, 4},
                {0, 0, 0, 8},
                {0, 0, 0, 0}
        };

        GameBoardFramework.moveLeft(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void moveLeftTest4() {
        int[][] INIT_GAME_BOARD_STATE = new int[][] {
                {64, 128, 256, 512},
                {64, 128, 256, 512},
                {128, 256, 512, 1024},
                {128, 256, 512, 1024}
        };

        int[][] EXPECTED_GAME_BOARD_STATE = new int[][] {
                {128, 256, 512, 1024},
                {256, 512, 1024, 2048},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        GameBoardFramework.moveLeft(INIT_GAME_BOARD_STATE);

        assertArrayEquals(EXPECTED_GAME_BOARD_STATE, INIT_GAME_BOARD_STATE);
    }

    @Test
    public void testShiftDownWithLeadingSpace() {
        int[][] testGameBoard = new int[][] {
                {0, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftDown(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{2, 2, 0, 0};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftDownWithTrailingSpace() {
        int[][] testGameBoard = new int[][] {
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftDown(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{2, 2, 2, 0};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftDownWithSpaceInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 2, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftDown(testGameBoard, 0);

        int[] expectedColumn = new int[]{2, 2, 2, 0};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftDownWithSpacesInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 0, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftDown(testGameBoard, 0);

        int[] expectedColumn = new int[]{2, 2, 0, 0};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithLeadingSpace() {
        int[][] testGameBoard = new int[][] {
                {0, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftUp(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{0, 0, 2, 2};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithTrailingSpace() {
        int[][] testGameBoard = new int[][] {
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        // Call Shift down on column index 0
        GameBoardFramework.shiftUp(testGameBoard, 0);

        // Expected column
        int[] expectedColumn = new int[]{0, 2, 2, 2};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithSpaceInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 2, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftUp(testGameBoard, 0);

        int[] expectedColumn = new int[]{0, 2, 2, 2};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }

    @Test
    public void testShiftUpWithSpacesInMiddle() {
        int[][] testGameBoard = new int[][] {
                {2, 0, 0, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame(testGameBoard);

        GameBoardFramework.shiftUp(testGameBoard, 0);

        int[] expectedColumn = new int[]{0, 0, 2, 2};
        assertArrayEquals(twentyFortyEightGame.getGameBoard()[0], expectedColumn);
    }
}
