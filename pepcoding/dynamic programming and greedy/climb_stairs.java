/* 
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.
*/

import java.util.*;

public class climb_stairs {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int paths = countPathsTab(n);
        System.out.println(paths);
        scn.close();
    }

    public static int countPathsTab(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i >= 2)
                dp[i] += dp[i - 2];
            if (i >= 3)
                dp[i] += dp[i - 3];
        }
        return dp[n];
    }

    public static int countPaths(int n, int[] qb) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        int p1 = countPaths(n - 1, qb);
        int p2 = countPaths(n - 2, qb);
        int p3 = countPaths(n - 3, qb);
        qb[n] = p1 + p2 + p3;
        return p1 + p2 + p3;
    }
}