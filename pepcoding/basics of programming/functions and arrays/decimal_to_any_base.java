/*
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.
*/

import java.util.*;

public class decimal_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }

    // Function for converting number from decimal to base-b number system
    public static int getValueInBase(int n, int b) {
        int p = 1; // Power variable - increases places
        int rv = 0; // Return value - stores answer
        while (n > 0) {
            int dig = n % b; // Digit-stores remainder at each step
            rv += (dig * p); // placing digit at right place
            p *= 10; // increasing power; to the next place
            n = n / b; // dividing the number by base number
        }
        return rv; // Final converted number
    }
}