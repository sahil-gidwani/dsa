public class ReverseArrayRecursion{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int[] arr, int i) {
        if (i >= arr.length/2) {
            return;
        }
        // swap left (i) and right (n - i - 1)
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;

        reverseArray(arr, i + 1);
    }
}