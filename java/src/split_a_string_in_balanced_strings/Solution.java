package split_a_string_in_balanced_strings;


// 1221. Split a String in Balanced Strings
// https://leetcode.com/problems/split-a-string-in-balanced-strings/

public class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int result  = 0;
        // Iterate string, with a balance counter, for counting the char equilibrium
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }
            // Each time the balance reaches 0 after adding the char to balance (both chars are balanced), add 1 to result
            if (balance == 0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.balancedStringSplit("RLRRLLRLRL")); // Expected 4
    }
}