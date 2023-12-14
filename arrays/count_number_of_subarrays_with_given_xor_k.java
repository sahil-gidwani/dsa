/*
Example 1:
Input Format: A = [4, 2, 2, 6, 4] , k = 6
Result: 4
Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
*/

import java.util.*;

public class count_number_of_subarrays_with_given_xor_k {

    /*
     * Proof:
     * XOR of the first part = x
     * XOR of the second part that we are searching = k
     * prefix XOR till index i = xr
     * Therefore, 
     * x ^ k = xr
     * x ^ k ^ k = xr ^ k (XOR with k in both sides)
     * x = xr ^ k
     * Hence the XOR of the first part must be xr ^ k (Proved)
    */
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1); //setting the value of 0
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];

            // by formula: x = xr ^ k:
            int x = xr ^ k;

            // add the occurrence of xr ^ k to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // insert the prefix xor till index i into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}

