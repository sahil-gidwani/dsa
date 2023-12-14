/*
1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.
*/

import java.util.*;

public class count_binary_strings {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int zeroes = 1;
        int ones = 1;
        for (int i = 2; i <= n; i++) {
            int nzeroes = ones;
            int nones = ones + zeroes;
            zeroes = nzeroes;
            ones = nones;
        }
        System.out.println(zeroes + ones);
    }
}