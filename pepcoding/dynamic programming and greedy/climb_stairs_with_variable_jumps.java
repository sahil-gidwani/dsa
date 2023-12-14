/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
    could jump to in a single move.  
    You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.
*/

import java.util.*;

public class climb_stairs_with_variable_jumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int reach = i + 1; reach <= Math.min(n, i + arr[i]); reach++) {
                dp[i] += dp[reach];
            }
        }
        System.out.println(dp[0]);
        scn.close();
    }
}