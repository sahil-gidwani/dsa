/*
1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed two transactions at-most.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).
*/

import java.io.*;

public class buy_sell_stocks_two_transactions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int misf = arr[0];
        int[] ps = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < misf) {
                misf = arr[i];
            }
            if (arr[i] - misf > ps[i - 1]) {
                ps[i] = arr[i] - misf;
            } else {
                ps[i] = ps[i - 1];
            }
        }
        int masf = arr[arr.length - 1];
        int[] pb = new int[arr.length];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > masf) {
                masf = arr[i];
            }
            if (masf - arr[i] > pb[i + 1]) {
                pb[i] = masf - arr[i];
            } else {
                pb[i] = pb[i + 1];
            }
        }
        int mp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (ps[i] + pb[i] > mp) {
                mp = ps[i] + pb[i];
            }
        }
        System.out.println(mp);
    }
}