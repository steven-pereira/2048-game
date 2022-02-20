package me.stevenpereira.twentyfortyeight.testing;

/**
 * Test mocks utility class.
 *
 * Purposely does not make mocks static, to avoid multiple tests
 * from referencing and manipulating the same mock objects, resulting
 * in unstable tests.
 */
public class GameBoardTestMocks {

    public int[][] GAME_BOARD_EMPTY = new int[][] {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public int[][] GAME_BOARD_FULL_NO_MOVES = new int[][] {
            {2, 4, 2, 4},
            {4, 2, 4, 2},
            {2, 4, 2, 4},
            {4, 2, 4, 2}
    };
}
