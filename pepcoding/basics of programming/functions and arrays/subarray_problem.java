/*
1. You are given an array of size 'n' and n elements of the same array.
2. You are required to find and print all the subarrays of the given array. 
3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
*/

import java.util.*;

public class subarray_problem {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int arrSize = arr.length;
        // start point
        for (int startPoint = 0; startPoint < arrSize; startPoint++) {
            // group sizes
            for (int grps = startPoint + 1; grps <= arrSize; grps++) {
                // if start point = 1 then
                // grp size = 1 , print 1
                // grp size = 2, print 1 2
                // grp size = 3, print 1 2 3 ans so on
                for (int j = startPoint; j < grps; j++) {
                    System.out.print(arr[j] + "	");
                }
                System.out.println();
            }
        }
        scn.close();
    }
}