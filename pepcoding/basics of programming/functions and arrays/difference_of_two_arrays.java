/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1
Assumption - number represented by a2 is greater.
*/

import java.util.*;

public class difference_of_two_arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        int[] diff = new int[n2];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int carry = 0;
        while (j >= 0) {
            int digit = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + carry >= a1v) {
                digit = a2[j] + carry - a1v;
                carry = 0;
            } else {
                digit = a2[j] + 10 + carry - a1v;
                carry = -1;
            }
            diff[j] = digit;
            i--;
            j--;
        }
        int idx = 0;
        // checking for leading zeroes in the answer array
        while (diff[idx] == 0) {
            ++idx;
        }
        while (idx < diff.length) // print the remaining array after zeroes
        {
            System.out.println(diff[idx++]);
        }
        scn.close();
    }
}