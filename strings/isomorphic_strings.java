/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false
*/

public class isomorphic_strings {
    
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int idx = 0; idx < s.length(); idx++){
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;

            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);
    }
}
