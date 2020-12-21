package maximum_69_number;

// 1323. Maximum 69 Number
// https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        String numString = "" + num;
        return Integer.parseInt(numString.replaceFirst("6", "9"));
    }
}