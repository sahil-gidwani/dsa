/*
1. You are given a string. 
2. You have to print all permutations of the given string iteratively.
*/

import java.util.*;

public class all_permutations_of_a_string_iteratively {
    public static void solution(String str) {
        int len = str.length();
        int total = factorial(len);
        for (int number = 0; number < total; number++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = number;
            for (int divisor = len; divisor >= 1; divisor--) {
                int q = temp / divisor;
                int r = temp % divisor;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }
}