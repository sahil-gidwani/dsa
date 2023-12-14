/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
*/

import java.util.*;

public class digit_frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int counter = 0; // initialize digit counter to 0
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            if (temp == d)
                counter++;
        }
        return counter;
    }
}