/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x. 
4. You are required to find the all indices at which x occurs in array a.
5. Return an array of appropriate size which contains all indices at which x occurs in array a.
*/

import java.util.*;

public class all_indices_of_array {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();
        int[] iarr = allIndices(arr, x, 0, 0);
        if (iarr.length == 0) {
            System.out.println("NO OUTPUT");
            return;
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // fsf is number of occurences of x stands for found so far
        if (idx == arr.length) {
            // we iterate through the array once until the end and return an empty array of
            // size fsf
            return new int[fsf];
        }
        if (arr[idx] == x) {
            // if we find x then we do idx++ and fsf++
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            // while coming back if x is found then we update the iarr with the index
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}