public class insertion_sort {

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // move elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert the current element into its correct position
            arr[j + 1] = current;
        }
    }

    // recursive insertion sort
    /*
    static void sort(int arr[], int i, int n) {
        // base case: i == n
        if (i == n) return;        
        
        int current = arr[i];
        int j = i - 1;

        // move elements of arr[0..i-1], that are greater than current,
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > current) {
            arr[j + 1] = arr[j];
            j--;
        }

        // insert the current element into its correct position
        arr[j + 1] = current;

        sort(arr, i + 1, n);
    }
    */

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };

        insertion_sort ob = new insertion_sort();
        ob.sort(arr);

        printArray(arr);
    }
};

/*
https://www.geeksforgeeks.org/insertion-sort/
*/