/*
1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.
*/

import java.util.*;

public class print_permutations {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
        scn.close();
    }

    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf); // question string is empty so print the answer now and return
            return;
        }
        // extracting each character at a time from the question string and appending it
        // to answer so far
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftPart = str.substring(0, i); // substring from 0 to i-1 (left to ch)
            String rightPart = str.substring(i + 1); // substring from i+1 till end of String (right to ch)
            String roq = leftPart + rightPart; // remaining string after extracting ch
            printPermutations(roq, asf + ch);
        }
    }
}