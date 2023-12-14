public class print_maximum_subarray_sum {

    // Kadane's Algorithm:
    public static void printMaximumSubarray(int[] arr) {
        int n = arr.length;
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        int start = 0; // start index of maximum subarray
        int end = 0; // end index of maximum subarray
        int tempStart = 0; // temporary start index for tracking current subarray

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        // if (maxi < 0) {
        //     maxi = 0;
        //     start = 0;
        //     end = 0;
        // }

        System.out.println("The maximum subarray is:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of the maximum subarray is: " + maxi);
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        printMaximumSubarray(arr);
    }
}
