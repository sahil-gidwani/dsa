/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the elements of array from end to beginning each in a separate line.
4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.
*/

import java.util.*;

public class display_array_reverse {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        displayArrRev(arr, 0);
        scn.close();
    }

    public static void displayArrRev(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        displayArrRev(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}