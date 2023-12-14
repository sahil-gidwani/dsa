import java.util.HashMap;

public class largest_subarray_with_0_sum {

    int maxLen(int A[], int n) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        largest_subarray_with_0_sum obj = new largest_subarray_with_0_sum();
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        System.out.println(obj.maxLen(arr, n));
    }
}
