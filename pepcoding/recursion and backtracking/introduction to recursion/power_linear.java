/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .
*/

import java.io.*;

public class power_linear {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int p = power(x, n);
        System.out.println(p);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnm1 = power(x, n - 1);
        int xpn = xpnm1 * x;
        return xpn;
    }
}