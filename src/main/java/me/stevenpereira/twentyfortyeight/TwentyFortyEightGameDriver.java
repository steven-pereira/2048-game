package me.stevenpereira.twentyfortyeight;

import java.util.Scanner;

public class TwentyFortyEightGameDriver {

    public static void main(String[] args) {
        TwentyFortyEightGame twentyFortyEightGame = new TwentyFortyEightGame();

        Scanner scanner = new Scanner(System.in);

        // Keep taking moves while game is still active (not won or lost)
        while (TwentyFortyEightGame.GameStatus.ACTIVE.equals(twentyFortyEightGame.getGameStatus())) {
            // Print game board
            twentyFortyEightGame.printGameBoard(twentyFortyEightGame.getGameBoard());

            // Ask for input
            System.out.println("What's your move? Left = 0, Right = 1, Up = 2, Down = 3");

            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    twentyFortyEightGame.move(twentyFortyEightGame.getGameBoard(), TwentyFortyEightGame.MoveDirection.LEFT);
                    break;
                case 1:
                    twentyFortyEightGame.move(twentyFortyEightGame.getGameBoard(), TwentyFortyEightGame.MoveDirection.RIGHT);
                    break;
                case 2:
                    twentyFortyEightGame.move(twentyFortyEightGame.getGameBoard(), TwentyFortyEightGame.MoveDirection.UP);
                    break;
                case 3:
                    twentyFortyEightGame.move(twentyFortyEightGame.getGameBoard(), TwentyFortyEightGame.MoveDirection.DOWN);
                    break;
                default:
                    System.out.println("Not a valid move, try again please!");
            }
        }

        if (TwentyFortyEightGame.GameStatus.WON.equals(twentyFortyEightGame.getGameStatus())) {
            System.out.println("CONGRATIONULATIONS, YOU'VE WON!!!");
        } else if (TwentyFortyEightGame.GameStatus.LOSS.equals(twentyFortyEightGame.getGameStatus())) {
            System.out.println("Ooops, you've  ran out of moves. Start again to play!");
        }
    }
}
