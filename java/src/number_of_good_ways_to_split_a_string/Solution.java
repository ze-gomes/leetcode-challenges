package number_of_good_ways_to_split_a_string;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countDiffCharacters("BABAABCA")); // Expected 3
        System.out.println(s.countDiffCharacters("abcd")); // Expected 4
        System.out.println(s.numSplits("abcd"));// Expected 1
        System.out.println(s.numSplits("acbadbaada"));
    }

    public int numSplits(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            // Traverse String and convert to the respective splits on by one
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);
            System.out.println(s1);
            System.out.println(s2);
            // Count diff chars in each split and add to result if number is the same
            if (countDiffCharacters(s1) == countDiffCharacters(s2)) {
                result++;
            }
        }
        return result;
    }

    // Count different chars in a String
    public int countDiffCharacters(String s) {
        Set<String> setChars = new HashSet<>();
        int diffChars = 0;
        for (int i = 0; i < s.length(); i++) {
            // Get each char
            String ch = Character.toString(s.charAt(i));
            setChars.add(ch);
        }
        return setChars.size();
    }
}