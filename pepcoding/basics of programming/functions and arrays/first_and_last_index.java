/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
Find first and last index of an element occurring in array
Asssumption - Array is sorted. Array may have duplicate values.
*/

import java.util.*;

public class first_and_last_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // enter data to be searched
        int data = scn.nextInt();
        // binary search to find last index
        int low = 0;
        int high = arr.length - 1;
        int last_index = -1;
        int first_index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                last_index = mid; // potential answer
                low = mid + 1; // we do not break on getting the match and further update the low pointer
                // as there could be another index holding the required value on the right side
            }
        }
        // binary search to find the first index
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                first_index = mid; // potential answer
                high = mid - 1; // we do not break on getting the match and further update the high pointer
                // as there could be another index holding the required value on the left side
            }
        }
        // both the binary search implementations store the final answer when the loop
        // breaks
        System.out.println(first_index);
        System.out.println(last_index);
        scn.close();
    }
}