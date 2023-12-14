/*
1. You are given a number n, representing the number of days.
2. You are given n numbers, where ith number represents price of stock on ith day.
3. You are give a number fee, representing the transaction fee for every transaction.
4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).
*/

import java.io.*;

public class buy_sell_stocks_with_transaction_fee {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int fee = Integer.parseInt(br.readLine());
        int bstp = -arr[0];
        int sstp = 0;
        for (int i = 1; i < arr.length; i++) {
            int nsstp = 0;
            int nbstp = 0;
            if (sstp - arr[i] > bstp) {
                nbstp = sstp - arr[i];
            } else {
                nbstp = bstp;
            }
            if (bstp + arr[i] - fee > sstp) {
                nsstp = bstp + arr[i] - fee;
            } else {
                nsstp = sstp;
            }
            bstp = nbstp;
            sstp = nsstp;
        }
        System.out.println(sstp);
    }
}