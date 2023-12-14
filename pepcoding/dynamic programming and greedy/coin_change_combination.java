/*
1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of combinations of the n coins using which the 
    amount "amt" can be paid.
Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
        used for many installments in payment of "amt"
Note2 -> You are required to find the count of combinations and not permutations i.e.
        2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
        combination. You should treat them as 1 and not 3.
*/

import java.io.*;

public class coin_change_combination {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int amt = Integer.parseInt(br.readLine());
        int[] dp = new int[amt + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i < dp.length; i++) {
                if (i >= coin) {
                    dp[i] += dp[i - coin];
                }
            }
        }
        System.out.println(dp[amt]);
    }
}