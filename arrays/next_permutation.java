/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Input: nums = [1,2,3]
Output: [1,3,2]
*/

public class next_permutation {

    public static int[] nextGreaterPermutation(int[] A) {
        int n = A.length;

        // step 1: find the break point:
        /*
         * Break-point means the first index i from the back of the given array where
         * arr[i] becomes smaller than arr[i+1].
         * For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be
         * index 1(0-based indexing). Here from the back of the array, index 1 is the
         * first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.
         */
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // if break point does not exist:
        /*
         * If such a break-point does not exist i.e. if the array is sorted in
         * decreasing order, the given permutation is the last one in the sorted order
         * of all possible permutations. So, the next permutation must be the first i.e.
         * the permutation in increasing order.
         * Example: {6, 5, 4, 3, 2, 1}
         * Answer: {1, 2, 3, 4, 5, 6}
         */
        if (ind == -1) {
            // reverse the whole array:
            reverseArray(A, 0, n - 1);
            return A;
        }

        // step 2: find the next greater element and swap it with arr[ind]:
        /*
         * Example: {2,1,5,4,3,0,0}
         * break point: index = 1
         * swap: {2,3,5,4,1,0,0}
        */
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                int tmp = A[i];
                A[i] = A[ind];
                A[ind] = tmp;
                break;
            }
        }

        // step 3: reverse the right half:  
        /*
         * Example: {2,1,5,4,3,0,0}
         * break point: index = 1
         * swap: {2,3,5,4,1,0,0}
         * reverse: {2,3,0,0,1,4,5}
        */      
        reverseArray(A, ind + 1, n - 1);

        return A;
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] A = { 2, 1, 5, 4, 3, 0, 0 };
        int[] ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("]");
    }
}
