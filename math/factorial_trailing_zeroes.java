/*
Given an integer n, return the number of trailing zeroes in n!.
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
*/

/*
To get a 0 at trail, there should be a pair of 2 and 5 in factors below n. We can observe that number of 2s as a factor is always greater than or equal to number of 5s as a factor. This means, number of pair of 2 and 5 really depends on number of 5s as a factor and thus all computation depends on 5 and not 2.
We basically have to count how many 5s as a factor, are there below the given number. For numbers < 25, We can find out how many 5s are there by simple doing n/5. For 25 (5^2) number of 0s are: 25/ 5 = 5 + 1. This one is added because 25 has 2 fives and not just one. Thus, an extra pair of 5 and 2 leading to an extra 0. This explanation continues for all the exponentiation of 5 lesser than the number itself.
*/
public class factorial_trailing_zeroes {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while(n>0){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }
}