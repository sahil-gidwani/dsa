/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
*/

import java.util.*;

public class toggle_case {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // convert to lowerCase
                char lc = (char) (ch - 'A' + 'a');
                sb.setCharAt(i, lc);
            } else if (ch >= 'a' && ch <= 'z') {
                // convert to UpperCase
                char uc = (char) (ch - 'a' + 'A');
                sb.setCharAt(i, uc);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }
}