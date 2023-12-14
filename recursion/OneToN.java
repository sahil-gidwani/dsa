public class OneToN{
    public static void main(String[] args) {
        int N = 10;
        print1toN(1, N);
    }

    static void print1toN(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        print1toN(i + 1, N);
    }
}