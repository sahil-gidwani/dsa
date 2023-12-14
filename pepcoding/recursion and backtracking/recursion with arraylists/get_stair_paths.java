/*
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.
*/

import java.util.*;

public class get_stair_paths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        scn.close();
    }

    // 3 -> 111 12 21 3
    // 2 -> 11 2
    // 1 -> 1
    // 0 -> 0
    // 3 -> 1 + p(3-1), 2 + p(3-2), 3 + p(3-3)
    public static ArrayList<String> getStairPaths(int n) {
        // base cases:
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            // 0 has a path which is dont move just stay
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            // no way to move from negative therefore return an empty arraylist
            return bres;
        }
        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1) {
            paths.add("1" + path);
        }
        for (String path : path2) {
            paths.add("2" + path);
        }
        for (String path : path3) {
            paths.add("3" + path);
        }
        return paths;
    }
}