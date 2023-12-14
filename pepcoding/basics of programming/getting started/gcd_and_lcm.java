/*
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.
*/

import java.util.*;

public class gcd_and_lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int tnum1 = num1;
        int tnum2 = num2;
        while (tnum1 % tnum2 != 0) {
            int rem = tnum1 % tnum2;
            tnum1 = tnum2;
            tnum2 = rem;
        }
        int gcd = tnum2;
        int lcm = (num1 * num2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        scn.close();
    }
}