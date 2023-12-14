public class SumOfNParameterized {
    public static void main(String[] args) {
        int N = 10;
        sumOfNParameterized(N, 0);
    }

    static void sumOfNParameterized(int i, int sum) {
        if (i == 0) {
            System.out.print(sum);
            return;
        }
        sumOfNParameterized(i - 1, sum + i);
    }
}
