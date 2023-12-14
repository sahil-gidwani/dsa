/*
1. You are given a number n, representing the size of array a.
2. You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
*/

import java.util.*;

public class find_element_in_an_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // taking input size of array
        int[] arr = new int[n]; // array declaration
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); // input array elements
        }
        int data = scn.nextInt(); // input data to match in array
        int idx = -1; // set our answer to -1 if we do not find our element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                idx = i;
                break;
            }
        }
        System.out.println(idx); // it prints the index if number is present, else -1.
        scn.close();
    }
}