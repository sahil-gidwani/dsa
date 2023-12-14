/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:
* Every consecutive pair of integers have opposite signs.
* For all integers with the same sign, the order in which they were present in nums is preserved.
* The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
*/

public class rearrange_array_elements_by_sign {

    public static void main(String[] args) {
        int[] A = { 1, 2, -4, -5 };
        int[] ans = rearrangeBySign(A);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] rearrangeBySign(int[] A) {
        int n = A.length;

        // define array for storing the ans separately.
        int[] ans = new int[n];

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // fill negative elements in odd indices and inc by 2.
            if (A[i] < 0) {
                ans[negIndex] = A[i];
                negIndex += 2;
            }

            // fill positive elements in even indices and inc by 2.
            else {
                ans[posIndex] = A[i];
                posIndex += 2;
            }
        }

        return ans;
    }
}
