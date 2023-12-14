/*
1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.
*/

import java.util.*;

public class factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = calculate(n);
        System.out.println(f);
        scn.close();
    }

    public static int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = calculate(n - 1);
        int fn = n * fnm1;
        return fn;
    }
}