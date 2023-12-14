/*
1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.
*/

import java.util.*;

public class arrange_buildings {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        scn.close();
        long ob = 1;
        long os = 1;
        for (int i = 2; i <= n; i++) {
            long nb = os;
            long ns = os + ob;
            ob = nb;
            os = ns;
        }
        long total = ob + os;
        System.out.println(total * total);
    }
}