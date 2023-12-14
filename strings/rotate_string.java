/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

Input: s = "abcde", goal = "cdeab"
Output: true
*/

public class rotate_string {

    public static boolean rotateString1(String A, String B) {
        /*
         * A + A contains all possible rotations of A
         * 
         * For example, say A is "waterbottle"
         * A + A would be "waterbottlewaterbottle"
         * Walk yourself through A + A and A, imagining a rotation at each letter of A
         * A quick example, if you rotate at index 3 in "waterbottle", the rotation is "erbottlewat".
         * "erbottlewat" is in "waterbottlewaterbottle" - at "wat | erbottlewat | erbottle"(index 3!)
         * 
         * This holds true for any rotation of A
         */
        return A.length() == B.length() && (A + A).contains(B);
    }

    public static boolean rotateString2(String A, String B) {
        if(A == null || B == null) {
            return false;
        }
        if(A.length() != B.length()) {
            return false;
        }
        if(A.length() == 0) {
            return true;
        }
        for(int i = 0; i < A.length(); i++) {
            if(rotateString2Util(A, B, i)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean rotateString2Util(String A, String B, int rotation) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        boolean ans = rotateString2(A, B);
        System.out.println(ans);
    }
}
