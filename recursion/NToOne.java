public class NToOne{
    public static void main(String[] args) {
        int N = 10;
        printNto1(N);
    }

    static void printNto1(int N) {
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNto1(N - 1);
    }
}