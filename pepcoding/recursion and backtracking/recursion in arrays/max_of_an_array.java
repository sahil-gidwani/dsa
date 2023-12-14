/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. 
4. For the purpose complete the body of maxOfArray function. Don't change the signature.
*/

import java.util.*;

public class max_of_an_array {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int max = maxOfArray(a, 0);
        System.out.println(max);
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx >= arr.length) {
            return Integer.MIN_VALUE; // we have the constraint that the size of array will not be zero hence we have
                                      // not considered that case here
        }
        int misa = maxOfArray(arr, idx + 1); // misa stands for maximum in smaller array
        if (arr[idx] > misa) {
            return arr[idx];
        }
        return misa;
    }
}