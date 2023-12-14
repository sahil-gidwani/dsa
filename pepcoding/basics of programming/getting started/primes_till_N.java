/*
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
*/

import java.util.*;

public class primes_till_N {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int num = low; num <= high; num++) {
            int div = 2;
            while (div * div <= num) {
                if (num % div == 0) {
                    break;
                }
                div++;
            }
            if (div * div > num) {
                System.out.println(num);
            }
        }
        scn.close();
    }
}