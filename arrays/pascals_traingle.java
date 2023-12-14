import java.util.*;

public class pascals_traingle {

    /*
     * We can optimize this calculation by the following observation.
     * Assume, given r = 7, c = 4.
     * Now, n = r-1 = 7-1 = 6 and r = c-1 = 4-1 = 3
     * Let’s calculate 6C3 = 6! / (3! *(6-3)!) = (6*5*4*3*2*1) / ((3*2*1)*(3*2*1))
     * This will boil down to (6*5*4) / (3*2*1)
     * So, nCr = (n*(n-1)*(n-2)*.....*(n-r+1)) / (r*(r-1)*(r-2)*....1)
     * 
     * Now, we will use this optimized formula to calculate the value of nCr. But
     * while implementing this into code we will take the denominator in the forward
     * direction like:
     * (n / 1)*((n-1) / 2)*.....*((n-r+1) / r)
     */
    public static long nCr(int n, int r) {
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    // in this case, we are given the row number r and the column number c,
    // and we need to find out the element at position (r,c).
    public static int pascalTriangleI(int r, int c) {
        // formula to find out the element i.e. r-1 C c-1
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    // given the row number n. print the n-th row of Pascal’s triangle
    /*
     * row 5 -> 1 5 10 10 5 1
     * Observation: first element = 1
     * second element = 5 -> 5 / 1
     * third element = 10 -> 5 * 4 / 1 * 2
     * fourth element = 10 -> 5 * 4 * 3 / 1 * 2 * 3
     * fifth element = 5 -> 5 * 4 * 3 * 2 / 1 * 2 * 3 * 4
     * sixth element = 1 - > 5 * 4 * 3 * 2 * 1 / 1 * 2 * 3 * 4 * 5
     * 
     * Current element = prevElement * (rowNumber - colIndex) / colIndex
     */
    public static void pascalTriangleII(int n) {
        long ans = 1;
        System.out.print(ans + " "); // printing 1st element

        // printing the rest of the part:
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    // given an integer numRows, return the first numRows of Pascal's triangle
    public static List<List<Integer>> pascalTriangleIII(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;

        /*
         * Think about the image as a matrix now where each line is basically a row in
         * the matrix. So, first things first, if you are at the edge of the matrix, the
         * value is 1, that’s for sure. Now, what about the inner elements? Well, any
         * inner element is obtained by doing the sum of the 2 values present in the row
         * just above it, i.e., if the element is at index (i, j), then matrix[i][j] can
         * be obtained by doing matrix[i – 1][j – 1] + matrix[i – 1][j]
         */
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            pre = row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangleI(r, c);
        System.out.println("The element at position (r,c) is: " + element);

        int n = 5;
        System.out.println("The " + n + "th row is: ");
        pascalTriangleII(n);

        n = 6;
        List<List<Integer>> res = pascalTriangleIII(n);
        System.out.println("Pascal's Triangle until " + n + " rows is: ");
        for (List<Integer> row : res) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
