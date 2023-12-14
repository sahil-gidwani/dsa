/*
1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are required to print the maximum profit you can make if you are allowed infinite transactions, but have to cooldown for 1 day after 1 transaction
i.e. you cannot buy on the next day after you sell, you have to cooldown for a day at-least before buying again.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).
*/

import java.io.*;

public class buy_sell_stocks_with_cooldown {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int bstp = -arr[0];
        int sstp = 0;
        int cstp = 0;
        for (int i = 1; i < arr.length; i++) {
            int nbstp = 0;
            int nsstp = 0;
            int ncstp = 0;
            if (cstp - arr[i] > bstp) {
                nbstp = cstp - arr[i];
            } else {
                nbstp = bstp;
            }
            if (bstp + arr[i] > sstp) {
                nsstp = bstp + arr[i];
            } else {
                nsstp = sstp;
            }
            if (sstp > cstp) {
                ncstp = sstp;
            } else {
                ncstp = cstp;
            }
            bstp = nbstp;
            sstp = nsstp;
            cstp = ncstp;
        }
        System.out.println(Math.max(sstp, cstp));
    }
}