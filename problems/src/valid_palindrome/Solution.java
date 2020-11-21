package valid_palindrome;

// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("0p"));
    }

    public boolean isPalindrome(String s) {
        // base condition
        if (s.equals("")) {
            return true;
        }
        // format string to no pontuation, no spaces and all lowercases
        String a = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // in the same for cycle, iterate string from left to right
        // and the from right to left with 2 counters, both chars have to match
        System.out.println(a);
        for (int i = 0, u = a.length() - 1; i < a.length(); i++, u--) {
            System.out.println(a.charAt(i) + " fim: " + a.charAt(u));
            if (a.charAt(i) == a.charAt(u)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}