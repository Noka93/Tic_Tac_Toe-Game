package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    private char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private char currentPlayer = 'X';


    public TicTacToe(){

    }


    public void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

    public void getPlayerMove() {
        System.out.print("Player " + currentPlayer + ", enter row (1-3): ");
        int row = sc.nextInt() - 1;
        System.out.print("Player " + currentPlayer + ", enter column (1-3): ");
        int col = sc.nextInt() - 1;
        if (board[row][col] != ' ') {
            System.out.println("Space already occupied, try again.");
            getPlayerMove();
        } else {
            board[row][col] = currentPlayer;
        }
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean isGameOver() {
        return (isRowWinner() || isColWinner() || isDiagWinner());
    }

    public boolean isRowWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public boolean isColWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public boolean isDiagWinner() {
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        } else if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    public void setCondition(){
        while (!isGameOver()) {
            printBoard();
            getPlayerMove();
            switchPlayer();
        }
        printBoard();
        System.out.println("Game over! " + currentPlayer + " wins!");
    }
}

