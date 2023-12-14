/*
1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map
   0 -> .;
   1 -> abc
   2 -> def
   3 -> ghi
   4 -> jkl
   5 -> mno
   6 -> pqrs
   7 -> tu
   8 -> vwx
   9 -> yz
3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.
*/

import java.io.*;

public class print_kpc {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printKPC(str, "");
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        for (char chcode : codes[ch - 48].toCharArray()) {
            printKPC(roq, asf + chcode);
        }
    }
}