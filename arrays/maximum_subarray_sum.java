/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/

public class maximum_subarray_sum {

    /*
     * Kadane's Algorithm:
     * 
     * The intuition of the algorithm is not to consider the subarray as a part of
     * the answer if its sum is less than 0. A subarray with a sum less than 0 will
     * always reduce our answer and so this type of subarray cannot be a part of the
     * subarray with maximum sum.
     * Here, we will iterate the given array with a single loop and while iterating
     * we will add the elements in a sum variable. Now, if at any point the sum
     * becomes less than 0, we will set the sum as 0 as we are not going to consider
     * any subarray with a negative sum. Among all the sums calculated, we will
     * consider the maximum one.
     */

    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // if sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        // if (maxi < 0) maxi = 0;

        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
