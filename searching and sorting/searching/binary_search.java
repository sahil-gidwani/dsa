public class binary_search {
    
    int binarySearchIterative(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }

    int binarySearchRecursive(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearchRecursive(arr, l, mid - 1, x);

            return binarySearchRecursive(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String args[]) {
        binary_search ob = new binary_search();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result1 = ob.binarySearchIterative(arr, x);
        if (result1 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at " + "index " + result1);

        int result2 = ob.binarySearchRecursive(arr, 0, n - 1, x);
        if (result2 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result2);
    }
}

/*
 * https://www.geeksforgeeks.org/binary-search/
 * Time Complexity:
 * Best Case: O(1)
 * Average Case: O(log N)
 * Worst Case: O(log N)
 * Auxiliary Space: O(1), If the recursive call stack is considered then the
 * auxiliary space will be O(logN).
 */