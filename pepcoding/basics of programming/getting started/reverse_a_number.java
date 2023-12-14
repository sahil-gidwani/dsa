/*
1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.
*/

import java.util.*;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            System.out.println(digit);
        }
        scn.close();
    }
}