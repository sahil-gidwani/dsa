/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:
Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.

Note:
Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
*/

public class string_to_integer_atoi {

    public static int myAtoi(String s) {
        int i = 0;
        int result = 0;
        int sign = 1;
        // base
        if (s.length() == 0)
            return 0;

        // discard white space
        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        // check the sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = (s.charAt(i++) == '-') ? -1 : 1;

        // proceed only if the char is digits
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // Since we are doing r = r * 10 + digit formula
            // when r > max / 10 if u do * 10 it will overflow
            // if r == max / 10 then any number + 7 will overflow
            // same case for under flow also
            // both case we should handle
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10))
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + (s.charAt(i++) - '0');
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String s = "   -42";
        int result = myAtoi(s);
        System.out.println(result);
    }
}