/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.
*/

import java.util.*;

public class any_base_addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) // while numbers are not-zero or carry is non-zero
        {
            int d1 = n1 % 10; // extracting digits
            int d2 = n2 % 10;
            int d = d1 + d2 + c; // adding up extracted digits
            c = d / b; // storing carry for next addition
            d = d % b;
            rv += d * p;
            p *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        return rv;
    }
}