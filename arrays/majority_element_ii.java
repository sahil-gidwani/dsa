/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Input: nums = [3,2,3]
Output: [3]
*/

import java.util.*;

/*
 * If we closely observe, in the given array, there can be a maximum of two integers 
 * that can occur more than floor(N/3) times. Let’s understand it using the following scenario:
 * Assume there are 8 elements in the given array. Now, if there is any majority element, 
 * it should occur more than floor(8/3) = 2 times. So, the majority of elements should occur 
 * at least 3 times. Now, if we imagine there are 3 majority elements, then the total occurrence 
 * of them will be 3X3 = 9 i.e. greater than the size of the array. But this should not happen. 
 * That is why there can be a maximum of 2 majority elements.
*/
public class majority_element_ii {

    public static List<Integer> majorityElement(int[] v) {
        int n = v.length;

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1)
                cnt1++;
            else if (v[i] == el2)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // manually check if the stored elements in el1 and el2 are the majority
        // elements:
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1)
                cnt1++;
            if (v[i] == el2)
                cnt2++;
        }

        int mini = (int) (n / 3) + 1;
        if (cnt1 >= mini)
            ls.add(el1);
        if (cnt2 >= mini)
            ls.add(el2);

        // uncomment the following line if it is told to sort the answer array:
        Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }

    public static void main(String args[]) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
