public class FibonacciRecursion {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(fibonacci(N));
    }

    static int fibonacci(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
