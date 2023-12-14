/*
1. You are given a positive number n. 
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
*/

import java.util.*;

public class print_decreasing {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
        scn.close();
    }

    public static void print(int n) {
        // Base case
        if (n == 0)
            return;
        // Self Work
        System.out.println(n);
        // Recursive call
        print(n - 1);
    }
}