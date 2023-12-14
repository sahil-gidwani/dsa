/*
You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.

Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.

Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
*/

public class kth_factor_of_n {
    public int kthFactor(int n, int k) {
        for(int i = 1; i < Math.sqrt(n); ++i) 
            if(n % i== 0 && --k == 0) 
                return i;                       
        for(int i = (int) Math.sqrt(n); i >= 1; --i) 
            if(n % (n/i) == 0 && --k == 0) 
                return n/i;          
        return -1;
    }
}