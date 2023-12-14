/*
1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.
*/

import java.util.*;

public class fibonacci_dp {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n + 1];
        int FibMemoized = FibMemoized(n, qb);
        System.out.println(FibMemoized);
        scn.close();
    }

    public static int FibMemoized(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        int fibn1 = FibMemoized(n - 1, qb);
        int fibn2 = FibMemoized(n - 2, qb);
        int fibn = fibn1 + fibn2;
        qb[n] = fibn;
        return fibn;
    }
}