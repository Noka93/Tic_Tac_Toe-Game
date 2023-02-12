package ticTacToe;

public class Tic_Tac_Toe_Two {


    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.printBoard();
        ticTacToe.getPlayerMove();
        ticTacToe.switchPlayer();
        ticTacToe.isGameOver();
        ticTacToe.isRowWinner();
        ticTacToe.isColWinner();
        ticTacToe.isDiagWinner();
        ticTacToe.setCondition();
    }
}
