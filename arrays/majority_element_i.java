/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

public class majority_element_i {

    // Moore Voting Algorithm
    public static int majorityElement(int[] v) {
        int n = v.length;
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i])
                cnt++;
            else
                cnt--;
        }

        return el;

        // in case majority element is not guaranteed:
        // checking if the stored element is the majority element
        // int cnt1 = 0;
        // for (int i = 0; i < n; i++) {
        //     if (v[i] == el)
        //         cnt1++;
        // }

        // if (cnt1 > (n / 2))
        //     return el;
        // return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
