public class NToOneBacktrack {
    public static void main(String[] args) {
        int N = 10;
        printNto1(1, N);
    }

    static void printNto1(int i, int N) {
        if (i > N) {
            return;
        }
        printNto1(i + 1, N);
        System.out.print(i + " ");
    }
}
