public class SumOfNFunctional {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(sumOfNFunctional(N));
    }

    static int sumOfNFunctional(int N) {
        if (N == 0) {
            return 0;
        }
        return N + sumOfNFunctional(N - 1);
    }
}
