/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.
*/

import java.util.*;

public class get_subsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
        scn.close();
    }

    // bc -> [ --,-c ,b-, bc ]
    // abc -> [ ---,--c, -b-, -bc, a--,ab-,abc]
    // abc -> [- + gss(bc), a + gss(bc)]
    public static ArrayList<String> gss(String str) {
        // base case : subsequence of an empty string is a blank character
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (String val : rres) {
            mres.add("" + val);
        }
        for (String val : rres) {
            mres.add(ch + val);
        }
        return mres;
    }
}