/*
1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.
*/

import java.io.*;

public class n_queens {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        // base case: if all rows have been marked then print
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        // checking for each row choices
        for (int col = 0; col < chess.length; col++) {
            // check if place is free and if its a safe spot
            if (chess[row][col] == 0 && isQueenSafe(chess, row, col) == true) {
                // mark it as placed
                chess[row][col] = 1;
                // try to place in next row
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                // if cant place then unmark it and start again at a different pos
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isQueenSafe(int[][] chess, int row, int col) {
        // checking left diagonal upwards
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // checking vertically upwards
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // checking right diagonal upwards
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // checking horizontally leftwards
        for (int i = row, j = col - 1; j >= 0; j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // no unsafe place detected
        return true;
    }
}