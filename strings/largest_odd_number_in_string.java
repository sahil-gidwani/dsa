/*
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
*/

public class largest_odd_number_in_string {

    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--)
            if (num.charAt(i) % 2 != 0)
                return num.substring(0, i + 1);
        return "";
    }

    public static void main(String[] args) {
        largest_odd_number_in_string lon = new largest_odd_number_in_string();
        String num = "52";
        System.out.println(lon.largestOddNumber(num));
    }
}