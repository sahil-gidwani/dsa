/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.
*/

import java.util.*;

public class get_maze_paths_with_jumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // base cases
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (sr > dr || sc > dc) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        // horizontal moves
        for (int hms = 1; hms <= dc - sc; hms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + hms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + hms + hpath);
            }
        }
        // vertical moves
        for (int vms = 1; vms <= dr - sr; vms++) {
            ArrayList<String> vpaths = getMazePaths(sr + vms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + vms + vpath);
            }
        }
        // diagonal moves
        for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++) {
            ArrayList<String> dpaths = getMazePaths(sr + dms, sc + dms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + dms + dpath);
            }
        }
        return paths;
    }
}