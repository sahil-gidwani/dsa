/*
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.
*/

import java.util.*;

public class any_base_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int value = getValue(n, sourceBase, destBase);
        System.out.println(value);
        scn.close();
    }

    public static int getValue(int n, int src, int dest) {
        int decimalValue = anyBaseToDecimal(n, src); // Converting to decimal
        int finalBaseValue = decimalToAnyBase(decimalValue, dest); // Converting to destination base
        return finalBaseValue;
    }

    // Function for converting number from decimal to base-b number system
    public static int decimalToAnyBase(int n, int b) {
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

    // Function for converting number from base-b number system to decimal
    public static int anyBaseToDecimal(int n, int b) {
        int rv = 0;
        int p = 0;
        while (n > 0) {
            int dig = n % 10; // storing rightmost digit as remainder
            rv += (dig * Math.pow(b, p)); // we use Math.pow(base,power) to calculate multiplier
            p++; // incrementing power
            n /= 10; // removing rightmost digit
        }
        return rv;
    }
}