/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/

/*
We can store one half of the integer in a another variable in reversed order. 
Then we compare it to the other unaltered half of the number and see if they are equal or not [which should be in case of palindromes]
*/
public class palindrome {
    public boolean isPalindrome(int x) {
        if(x<0 || x!=0 && x%10 == 0) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);
    }
}