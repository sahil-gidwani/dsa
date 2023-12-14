/*
You are given a read-only array of N integers with values also in the range [1, N] both inclusive. 
Each integer appears exactly once except A which appears twice and B which is missing. 
The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Example 1:
Input Format:  array[] = {3,1,2,5,3}
Result: {3,4)
Explanation: A = 3 , B = 4 
Since 3 is appearing twice and 4 is missing
*/

public class find_the_repeating_and_missing_numbers {

    /*
     * X - repeating number
     * Y - missing number
     * Sn = summation of first N numbers -> Sn = (N*(N+1))/2
     * S = summation of all the elements in the given array
     * S - Sn = X - Y ...... (1)
     * S2n = summation of squares of the first N numbers -> S2n = (N*(N+1)*(2N+1))/6
     * S2 = summation of squares of all the elements in the given array
     * S2 - S2n = X^2 - Y^2 ...... (2)
     * X + Y = (S2 - S2n) / (X - Y) ...... (3)
    */
    public static int[] findMissingRepeatingNumbers(int[] a) {
        long n = a.length;
        // find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long) a[i] * (long) a[i];
        }

        // S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        // find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        // find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = { (int) x, (int) y };
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 5, 4, 6, 7, 5 };
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "}");
    }
}
