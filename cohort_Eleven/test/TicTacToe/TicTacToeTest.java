package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    String playerX;
    String playerO;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe(3, 3);
        playerX = "x";
        playerO = "o";
    }

    @Test
    void testForA2DArrayBoardContainer() {
        String[][] array = new String[3][3];
        assertArrayEquals(array, ticTacToe.getArray());
    }

    @Test
    void testThatTheBoardCellsAreEmpty() {
        String[][] board = ticTacToe.getArray();
        ticTacToe.setDefaultValuesForAllCells();
        for (String[] cell : board) {
            assertNotNull(cell);
        }
    }

    @Test
    void testThatPlayerCanPickAChoice() {
        ticTacToe.chooseFirstPlayer(playerX);
        assertEquals("X", ticTacToe.getFirstPlayerChoice());
    }

    @Test
    void testThatNextPlayerPicksTheOtherChoiceAfterFirstPlayer() {
        ticTacToe.chooseFirstPlayer(playerO);
        ticTacToe.setSecondPlayerAfterFirstPlayerPicks();
        assertNotNull(ticTacToe.getSecondPlayer());
    }

    @Test
    void testThatPlayerMadeAValidMove() {
        int spaceFive = 5;
        String[][] board = ticTacToe.getArray();
        ticTacToe.setDefaultValuesForAllCells();
        assertTrue(ticTacToe.isMoveValid(spaceFive, board));
    }

    @Test
    void testThatFirstPlayerCanPlaceOnEmptyCell() {
        int spaceEight = 8;
        String[][] board = ticTacToe.getArray();
        ticTacToe.setDefaultValuesForAllCells();
        ticTacToe.chooseFirstPlayer(playerX);
        ticTacToe.setPlayerMarkOnBoard(spaceEight, playerX, board);
        assertEquals("X", ticTacToe.getValueAtPositionEntered(spaceEight, board));
    }

    @Test
    void testThatNextPlayerCantPlaceOnAlreadyPlacedCell() {
        int spaceSix = 6;
        int sameSpaceSix = 6;
        String[][] board = ticTacToe.getArray();
        ticTacToe.setDefaultValuesForAllCells();
        ticTacToe.chooseFirstPlayer(playerO);
        ticTacToe.setPlayerMarkOnBoard(spaceSix, playerO, board);
        ticTacToe.setPlayerMarkOnBoard(sameSpaceSix, playerX, board);
        assertEquals("This space is already filled, choose another number ", ticTacToe.getReturnMessage());
    }

    @Test
    void testThatAPlayerWins() {
        int spaceEight = 8;
        int spaceSeven = 7;
        int spaceNine = 9;
        String[][] board = ticTacToe.getArray();
        ticTacToe.setDefaultValuesForAllCells();
        ticTacToe.chooseFirstPlayer(playerO);
        ticTacToe.setPlayerMarkOnBoard(spaceSeven, playerO, board);
        ticTacToe.setPlayerMarkOnBoard(spaceEight, playerO, board);
        ticTacToe.setPlayerMarkOnBoard(spaceNine, playerO, board);
        assertTrue(ticTacToe.checkForWinner(playerO, board));
    }

    @Test
    void testForWinnerDisplay() {
        int spaceEight = 8;
        int spaceSeven = 7;
        int spaceFive = 5;
        int spaceThree = 3;
        int spaceSix = 6;
        int spaceNine = 9;
        String[][] board = ticTacToe.getArray();
        ticTacToe.setDefaultValuesForAllCells();
        ticTacToe.chooseFirstPlayer(playerO);
        ticTacToe.setSecondPlayerAfterFirstPlayerPicks();
        ticTacToe.setPlayerMarkOnBoard(spaceSeven, playerO, board);
        ticTacToe.setPlayerMarkOnBoard(spaceEight, playerO, board);
        ticTacToe.setPlayerMarkOnBoard(spaceFive, playerO, board);
        ticTacToe.setPlayerMarkOnBoard(spaceThree, playerX, board);
        ticTacToe.setPlayerMarkOnBoard(spaceSix, playerX, board);
        ticTacToe.setPlayerMarkOnBoard(spaceNine, playerX, board);
        assertTrue(ticTacToe.isGameOver(playerX, board));
    }
}


