package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static char player = 'X';
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        initBoard();
        displayBoard();
        while (!gameOver()) {
            System.out.println(player + " choose your location (row, column): ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();
            if (validMove(row, col)) {
                board[row][col] = player;
                player = player == 'X' ? 'O' : 'X';
                displayBoard();
            } else System.out.println("Invalid input!");
        }
        System.out.println("Congratulation!!!");
    }
    public static boolean gameOver() {
        return checkWinner('X') || checkWinner('O');
    }

    public static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static boolean validMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        } else {
            return board[row][col] == ' ';
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}