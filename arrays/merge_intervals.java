import java.util.*;

public class merge_intervals {

    public static int[][] mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        // sort the given intervals based on the start time:
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[][] mergedIntervals = new int[n][2];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            // if the current interval does not overlap with the previous one:
            if (idx == 0 || arr[i][0] > mergedIntervals[idx - 1][1]) {
                mergedIntervals[idx][0] = arr[i][0];
                mergedIntervals[idx][1] = arr[i][1];
                idx++;
            }
            // if the current interval overlaps with the previous one, merge them:
            else {
                mergedIntervals[idx - 1][1] = Math.max(mergedIntervals[idx - 1][1], arr[i][1]);
            }
        }

        // resize the mergedIntervals array to remove unused slots (if any):
        return Arrays.copyOf(mergedIntervals, idx);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        int[][] mergedIntervals = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (int[] interval : mergedIntervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println();
    }
}
