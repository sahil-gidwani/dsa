/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Input: nums = [1,2,3], k = 3
Output: 2
*/

import java.util.*;

public class subarray_sum_equals_k {

    public int subarraySum(int[] nums, int k) {
        int preSum = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : nums) {
            preSum += i;
            int remove = preSum - k;
            cnt += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;

        subarray_sum_equals_k obj = new subarray_sum_equals_k();
        int ans = obj.subarraySum(nums, k);
        System.out.println("The number of subarrays with sum " + k + " is " + ans);
    }
}