package valid_anagram;

import java.util.Arrays;

// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        //  Anagram is always same length
        if (s.length() != t.length()) {
            return false;
        } else {
            // Convert string o char[]
            char[] arrayS = s.toCharArray();
            char[] arrayT = t.toCharArray();
            // Sort all chars
            Arrays.sort(arrayS);
            Arrays.sort(arrayT);
            // Every char in both strings has to match
            for (int i = 0; i < arrayS.length; i++) {
                if (!(arrayS[i] == arrayT[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}