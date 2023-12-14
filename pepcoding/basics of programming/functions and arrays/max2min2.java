/*
You are given an array A of n unique integers.
You have to find 2nd maximum and 2nd minimum numbers in this array.
*/

import java.util.*;

public class max2min2 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        if (n >= 2) {
            Arrays.sort(arr);
            int max2 = 0, min2 = 0;
            int i = 0;
            for (i = n - 2; i >= 0; i--) {
                if (arr[i] != arr[n - 1]) {
                    max2 = arr[i];
                    break;
                }
            }
            for (i = 1; i < n; i++) {
                if (arr[i] != arr[0]) {
                    min2 = arr[i];
                    break;
                }
            }
            System.out.println(max2 + " " + min2);
        }
        scn.close();
    }
}
