/*
1. You are given a positive number n. 
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.
*/

import java.util.*;

public class print_increasing {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
        scn.close();
    }

    public static void print(int n) {
        if (n == 0) // Base case
            return;
        print(n - 1);// Recursive call
        System.out.println(n);// Self Work
    }
}