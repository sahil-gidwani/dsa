/*
x * 1 = x
x * 2 = 2x
..
x * 10 = 10x
*/

import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));
        }
        scn.close();
    }
}