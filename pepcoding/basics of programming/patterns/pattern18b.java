/*
*   *   *   *   *   *   *
    *   *   *   *   *
        *   *   *
            *
        *       *
    *               *
*   *   *   *   *   *   *
*/

import java.util.*;

public class pattern18b {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n % 2 != 0) {
            int nst = n;
            int nsp = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= nsp; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= nst; j++) {
                    if (i > 1 && i > n / 2 && i <= n - 1 && j > 1 && j < nst) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                }
                if (i <= n / 2) {
                    nst -= 2;
                    nsp++;
                } else {
                    nst += 2;
                    nsp--;
                }
                System.out.println();
            }
        }
        scn.close();
    }
}