/*
Given an array, print all the elements which are leaders. 
A Leader is an element that is greater than all of the elements on its right side in the array.
*/

public class leaders_in_an_array {

    public static int[] printLeadersBruteForce(int[] arr, int n) {

        int[] ans = new int[n];
        int index = 0; 

        // last element of an array is always a leader, add it to the ans array
        int max = arr[n - 1];
        ans[index++] = arr[n - 1];

        // start checking from the end whether a number is greater than max number from right, hence leader
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans[index++] = arr[i];
                max = arr[i];
            }
        }

        // since the ans array might have extra zeros at the end, create a new array
        int[] result = new int[index];
        System.arraycopy(ans, 0, result, 0, index);

        return result;
    }

    public static void main(String args[]) {
        int n = 6;
        int[] arr = { 10, 22, 12, 3, 0, 6 };

        int[] ans = printLeadersBruteForce(arr, n);

        // reverse the array to get the elements in descending order
        int[] reversedAns = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            reversedAns[i] = ans[ans.length - 1 - i];
        }

        for (int i = 0; i < reversedAns.length; i++) {
            System.out.print(reversedAns[i] + " ");
        }
    }
}

