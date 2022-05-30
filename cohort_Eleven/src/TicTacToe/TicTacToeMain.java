package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String... args) {
        TicTacToe gameBoard = new TicTacToe(3, 3);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let's play game to know who will first complete marks on the board :)");
        String defaultBoard = """
                   |  |
                ---------
                   |  |
                ---------
                   |  |""";
        System.out.println(defaultBoard);
        System.out.println("Player pick your choice letter \"X\" or letter \"O\"");
        gameBoard.setDefaultValuesForAllCells();
        String playerOneMark = scanner.nextLine();
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        gameBoard.chooseFirstPlayer(playerOneMark);
        gameBoard.setSecondPlayerAfterFirstPlayerPicks();
        String playerTwoMark = gameBoard.getSecondPlayer();
        System.out.println("Computer game piece is set to " + playerTwoMark);
        gameBoard.displayBoard(gameBoard.getArray());

        while (true) {
            System.out.println();
            System.out.print("Player One enter the number to place mark: ");
            playerOnePosition = Integer.parseInt(scanner.nextLine());
            gameBoard.firstPlayerMove(playerOneMark, gameBoard.getArray(), playerOnePosition);

            System.out.println();
            System.out.print("Computer placed mark in number: ");
            playerTwoPosition = random.nextInt(10);
            System.out.println(playerTwoPosition);
            gameBoard.secondPlayerMove(playerTwoMark, gameBoard.getArray(), playerTwoPosition);
        }
    }
}
