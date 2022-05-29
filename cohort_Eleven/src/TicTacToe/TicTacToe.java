package TicTacToe;

import java.util.Objects;

public class TicTacToe {

    String[][] ttt;
    private String playerOne;
    private String playerTwo;
    private String message;

    public TicTacToe(int rows, int columns) {
        this.ttt = new String[rows][columns];
    }

    public String[][] getArray() {
        return ttt;
    }

    public void setDefaultValuesForAllCells() {
        for (int i = 0; i < ttt.length; i++) {
            for (int j = 0; j < ttt[i].length; j++) {
                if (ttt[i][j] == null) ttt[i][j] = " ";
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

    public void setSecondPlayerAfterFirstPlayerPicks(String playerX, String playerO) {
        if (playerOne != null) {
            if (playerOne.equals(playerX.toUpperCase())) this.playerTwo = playerO.toUpperCase();
            else if (playerOne.equals(playerO.toUpperCase())) this.playerTwo = playerX.toUpperCase();
        } else throw new IllegalArgumentException("Choose a player");
    }

    public String getSecondPlayer() {
        return playerTwo;
    }

    public boolean isMoveValid(int cellNumToPlaceMark, String[][] board) {
        switch (cellNumToPlaceMark) {
            case 1 -> {
                return board[0][0].equals(" ");
            }
            case 2 -> {
                return Objects.equals(board[0][1], " ");
            }
            case 3 -> {
                return Objects.equals(board[0][2], " ");
            }
            case 4 -> {
                return Objects.equals(board[1][0], " ");
            }
            case 5 -> {
                return Objects.equals(board[1][1], " ");
            }
            case 6 -> {
                return Objects.equals(board[1][2], " ");
            }
            case 7 -> {
                return Objects.equals(board[2][0], " ");
            }
            case 8 -> {
                return Objects.equals(board[2][1], " ");
            }
            case 9 -> {
                return Objects.equals(board[2][2], " ");
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
        } else {
            this.message = "This space is already filled";
        }
    }

    public String getReturnMessage() {
        return message;
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

    public String isGameOver(String playerMark, String[][] board) {
        playerMark = playerMark.toUpperCase();
        if (checkForWinner(playerMark, board)){
            if (Objects.equals(playerOne, playerMark)) return "Player one wins the game.";
        }
        return "Player two wins the game.";
    }
}
