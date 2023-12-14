/*
1. Here are a few sets of inputs and outputs for your reference
Input1 -> 1
Output1 -> 1 1 1

Input2 -> 2
Output2 -> 2 1 1 1 2 1 1 1 2

Input2 -> 3
Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.
*/

import java.io.*;

public class print_zigzag {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0) {
            return;
        }
        // neural tree network
        System.out.print(n + " ");// pre
        pzz(n - 1);
        System.out.print(n + " ");// in
        pzz(n - 1);
        System.out.print(n + " ");// post
    }
}