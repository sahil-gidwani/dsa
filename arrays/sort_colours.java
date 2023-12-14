/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/

public class sort_colours {

    /*
     * This problem is a variation of the popular Dutch National flag algorithm.
     * 
     * This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.
     * 
     * The rules are the following:
     * arr[0….low-1] contains 0. [Extreme left part]
     * arr[low….mid-1] contains 1.
     * arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
     */
    public static void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String args[]) {
        int n = 6;
        int[] arr = { 0, 2, 1, 2, 0, 1 };
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
