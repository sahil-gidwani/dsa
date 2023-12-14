/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.*;

public class two_sum {

    public static int[] twoSum(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int[] ans = new int[2];

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans[0] = left;
                ans[1] = right;
                break;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("Target indices: " + Arrays.toString(ans));
    }
}