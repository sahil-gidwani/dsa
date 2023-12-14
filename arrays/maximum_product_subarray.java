/*
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
*/

public class maximum_product_subarray {

    // modified Kadane's algorithm
    public static int maxProduct1(int[] nums) {
        int maxSum = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // when you multiply by a negative number the max becomes the min and min becomes the max
            if (nums[i] < 0) {
                int tmp = currentMax;
                currentMax = currentMin;
                currentMin = tmp;
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    // two pointers
    public static int maxProduct2(int arr[]) {
        int maxLeft = arr[0];
        int maxRight = arr[0];

        boolean zeroPresent = false;

        int prod = 1;
        for (int i : arr) {
            prod *= i;
            if (i == 0) {
                zeroPresent = true;
                prod = 1;
                continue;
            }
            maxLeft = Math.max(maxLeft, prod);
        }

        prod = 1;
        for (int j = arr.length - 1; j >= 0; j--) {
            prod *= arr[j];
            if (arr[j] == 0) {
                zeroPresent = true;
                prod = 1;
                continue;
            }
            maxRight = Math.max(maxRight, prod);
        }

        if (zeroPresent)
            return Math.max(Math.max(maxLeft, maxRight), 0);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.out.println(maxProduct1(arr));
        System.out.println(maxProduct2(arr));
    }
}