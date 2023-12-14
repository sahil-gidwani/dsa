public class sentinel_linear_search {
    
    static void sentinelSearch(int arr[], int n, int key) {
        int last = arr[n - 1];

        arr[n - 1] = key;
        int i = 0;

        while (arr[i] != key)
            i++;

        arr[n - 1] = last;

        if ((i < n - 1) || (arr[n - 1] == key))
            System.out.println(key + " is present at index " + i);
        else
            System.out.println("Element Not found");
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
        int n = arr.length;
        int key = 180;

        sentinelSearch(arr, n, key);
    }
}

/*
https://www.geeksforgeeks.org/sentinel-linear-search/
Time Complexity:
Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
Average Case: O(N)
Auxiliary Space: O(1) as except for the variable to iterate through the list, no other variable is used. 
*/