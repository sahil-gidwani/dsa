/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.
*/

import java.io.*;

public class power_logarithmic {
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
    int xpnb2 = power(x, n / 2);
    int xpn = xpnb2 * xpnb2;
    // x^17 = x^8 * x^8 * x
    if (n % 2 == 1) {
      xpn = xpn * x;
    }
    return xpn;
  }
}