/*
1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without overflowing it's capacity.
Note1 -> Items can be added to the bag even partially. But you are not allowed to put same items again and again to the bag.
*/

import java.io.*;
import java.util.*;

public class fractional_knapsack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] values = new int[n];
        String str1 = br.readLine();
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(str1.split(" ")[i]);
        }
        int[] wts = new int[n];
        String str2 = br.readLine();
        for (int i = 0; i < n; i++) {
            wts[i] = Integer.parseInt(str2.split(" ")[i]);
        }
        int cap = Integer.parseInt(br.readLine());
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item();
            items[i].wt = wts[i];
            items[i].val = values[i];
            items[i].vwratio = items[i].val * 1.0 / items[i].wt;
        }
        Arrays.sort(items);
        double vib = 0;
        int rc = cap;
        int i = items.length - 1;
        while (i >= 0) {
            if (items[i].wt <= rc) {
                vib += items[i].val;
                rc -= items[i].wt;
            } else {
                vib += items[i].val * 1.0 * rc / items[i].wt;
                rc = 0;
                break;
            }
            i--;
        }
        System.out.println(vib);
    }

    public static class Item implements Comparable<Item> {
        int wt;
        int val;
        double vwratio;

        public int compareTo(Item o) {
            if (this.vwratio == o.vwratio) {
                return 0;
            } else if (this.vwratio > o.vwratio) {
                return +1;
            } else {
                return -1;
            }
        }
    }
}
