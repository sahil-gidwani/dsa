/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.
*/

import java.io.*;

public class print_maze_paths_with_jumps {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr > dr || sc > dc) {
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        for (int move = 1; move <= dc - sc; move++) {
            printMazePaths(sr, sc + move, dr, dc, psf + "h" + move);
        }
        for (int move = 1; move <= dr - sr; move++) {
            printMazePaths(sr + move, sc, dr, dc, psf + "v" + move);
        }
        for (int move = 1; move <= dc - sc && move <= dr - sr; move++) {
            printMazePaths(sr + move, sc + move, dr, dc, psf + "d" + move);
        }
    }
}