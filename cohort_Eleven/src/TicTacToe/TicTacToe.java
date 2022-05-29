package TicTacToe;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    String[][] ttt;
    private String playerOne;
    private String playerTwo;
    private String availableSpaceStatusMessage;
    private String firstPlayerWinMessage;
    private String secondPlayerWinMessage;

    public TicTacToe(int rows, int columns) {
        this.ttt = new String[rows][columns];
    }

    public String[][] getArray() {
        return ttt;
    }

    public void displayBoard(String[][] board) {
        System.out.print(board[0][0]);
        System.out.print(" | ");
        System.out.print(board[0][1]);
        System.out.print(" | ");
        System.out.print(board[0][2]);
        System.out.println();
        System.out.print("---------");
        System.out.println();
        System.out.print(board[1][0]);
        System.out.print(" | ");
        System.out.print(board[1][1]);
        System.out.print(" | ");
        System.out.print(board[1][2]);
        System.out.println();
        System.out.print("---------");
        System.out.println();
        System.out.print(board[2][0]);
        System.out.print(" | ");
        System.out.print(board[2][1]);
        System.out.print(" | ");
        System.out.print(board[2][2]);
        System.out.println();
    }

    public void setDefaultValuesForAllCells() {
        int counter = 1;
        for (int i = 0; i < ttt.length; i++) {
            for (int j = 0; j < ttt[i].length; j++) {
                if (ttt[i][j] == null) ttt[i][j] = String.valueOf(counter);
                counter++;
            }
        }
    }

    public void chooseFirstPlayer(String player) {
        if (player.equalsIgnoreCase("x")) this.playerOne = player.toUpperCase();
        else if (player.equalsIgnoreCase("o")) this.playerOne = player.toUpperCase();
    }

    public String getFirstPlayerChoice() {
        return playerOne;
    }

    public void setSecondPlayerAfterFirstPlayerPicks() {
        if (playerOne != null) {
            if (playerOne.equals("X")) this.playerTwo = "O";
            else if (playerOne.equals("O")) this.playerTwo = "X";
        } else throw new IllegalArgumentException("Choose a player");
    }

    public String getSecondPlayer() {
        return playerTwo;
    }

    public boolean isMoveValid(int cellNumToPlaceMark, String[][] board) {
        switch (cellNumToPlaceMark) {
            case 1 -> {
                return board[0][0].equals("1");
            }
            case 2 -> {
                return Objects.equals(board[0][1], "2");
            }
            case 3 -> {
                return Objects.equals(board[0][2], "3");
            }
            case 4 -> {
                return Objects.equals(board[1][0], "4");
            }
            case 5 -> {
                return Objects.equals(board[1][1], "5");
            }
            case 6 -> {
                return Objects.equals(board[1][2], "6");
            }
            case 7 -> {
                return Objects.equals(board[2][0], "7");
            }
            case 8 -> {
                return Objects.equals(board[2][1], "8");
            }
            case 9 -> {
                return Objects.equals(board[2][2], "9");
            }
            default -> {
                return false;
            }
        }
    }

    public String getValueAtPositionEntered(int cellNumToPlaceMark, String[][] board) {
        switch (cellNumToPlaceMark) {
            case 1 -> {
                return board[0][0];
            }
            case 2 -> {
                return board[0][1];
            }
            case 3 -> {
                return board[0][2];
            }
            case 4 -> {
                return board[1][0];
            }
            case 5 -> {
                return board[1][1];
            }
            case 6 -> {
                return board[1][2];
            }
            case 7 -> {
                return board[2][0];
            }
            case 8 -> {
                return board[2][1];
            }
            case 9 -> {
                return board[2][2];
            }
            default -> throw new IllegalStateException("This cell position is already filled");
        }
    }

    public void setPlayerMarkOnBoard(int cellNumToPlaceMark, String playerMark, String[][] board) {
        playerMark = playerMark.toUpperCase();
        if (isMoveValid(cellNumToPlaceMark, board)) {
            switch (cellNumToPlaceMark) {
                case 1 -> board[0][0] = playerMark;
                case 2 -> board[0][1] = playerMark;
                case 3 -> board[0][2] = playerMark;
                case 4 -> board[1][0] = playerMark;
                case 5 -> board[1][1] = playerMark;
                case 6 -> board[1][2] = playerMark;
                case 7 -> board[2][0] = playerMark;
                case 8 -> board[2][1] = playerMark;
                case 9 -> board[2][2] = playerMark;
                default -> throw new IllegalStateException("Unexpected value: " + cellNumToPlaceMark);
            }
        } else if (!Objects.equals(playerOne, playerMark)) {
            this.availableSpaceStatusMessage = "This space is already filled, choose another number ";
            System.out.print(availableSpaceStatusMessage);
            Random random = new Random();
            int playerTwoPosition = random.nextInt(10);
            setPlayerMarkOnBoard(playerTwoPosition, playerMark, board);
        } else {
            this.availableSpaceStatusMessage = "This space is already filled, choose another number ";
            System.out.println(availableSpaceStatusMessage);
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            setPlayerMarkOnBoard(userInput, playerMark, board);
        }
    }

    public String getReturnMessage() {
        return availableSpaceStatusMessage;
    }

    public boolean checkForWinner(String playerMark, String[][] board) {
        playerMark = playerMark.toUpperCase();
        return (Objects.equals(board[0][0], playerMark) && Objects.equals(board[0][1], playerMark) && Objects.equals(board[0][2], playerMark)) ||
               (Objects.equals(board[1][0], playerMark) && Objects.equals(board[1][1], playerMark) && Objects.equals(board[1][2], playerMark)) ||
               (Objects.equals(board[2][0], playerMark) && Objects.equals(board[2][1], playerMark) && Objects.equals(board[2][2], playerMark)) ||
               (Objects.equals(board[0][0], playerMark) && Objects.equals(board[1][0], playerMark) && Objects.equals(board[2][0], playerMark)) ||
               (Objects.equals(board[0][1], playerMark) && Objects.equals(board[1][1], playerMark) && Objects.equals(board[2][1], playerMark)) ||
               (Objects.equals(board[0][2], playerMark) && Objects.equals(board[1][2], playerMark) && Objects.equals(board[2][2], playerMark)) ||
               (Objects.equals(board[0][0], playerMark) && Objects.equals(board[1][1], playerMark) && Objects.equals(board[2][2], playerMark)) ||
               (Objects.equals(board[0][2], playerMark) && Objects.equals(board[1][1], playerMark) && Objects.equals(board[2][0], playerMark));
    }

    public boolean isGameOver(String playerMark, String[][] board) {
        playerMark = playerMark.toUpperCase();
        if (checkForWinner(playerMark, board)) {
            if (Objects.equals(playerOne, playerMark)) return true;
            else return Objects.equals(playerTwo, playerMark);
        }
        return false;
    }

    public void firstPlayerMove(String playerMark, String[][] board, int cellNumToPlaceMark) {
        setPlayerMarkOnBoard(cellNumToPlaceMark, playerMark, board);
        displayBoard(getArray());
        if (isGameOver(playerMark, board)) {
            this.firstPlayerWinMessage = "Player one wins the game.";
            System.out.println(firstPlayerWinMessage);
            System.exit(0);
        }
    }

    public String getFirstPlayerMessage() {
        return firstPlayerWinMessage;
    }

    public void secondPlayerMove(String playerMark, String[][] board, int cellNumToPlaceMark) {
        setPlayerMarkOnBoard(cellNumToPlaceMark, playerMark, board);
        displayBoard(getArray());
        if (isGameOver(playerMark, board)) {
            this.secondPlayerWinMessage = "Player two wins the game.";
            System.out.println(secondPlayerWinMessage);
            System.exit(0);
        }
    }

    public String getSecondPlayerMessage() {
        return secondPlayerWinMessage;
    }
}
