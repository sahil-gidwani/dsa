public class pow_of_two {
    public static void main(String[] args) {
        int n = 31; // find out if n is a power of 2
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}