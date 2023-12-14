/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
*/

import java.util.*;

public class digits_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int power = 1;
        int temp = n;
        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }
        temp = n;
        while (power != 0) {
            int digit = temp / power;
            System.out.println(digit);
            temp = temp % power;
            power = power / 10;
        }
        /*
         * // Converting the integer input to string data
         * String string_number = Integer.toString(n);
         * // Traversing through the string using for loop
         * for (int i = 0; i < string_number.length(); i++) {
         * // Printing the characters at each position
         * System.out.println(string_number.charAt(i));
         * }
         */
        scn.close();
    }
}