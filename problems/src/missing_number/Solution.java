package missing_number;


// 268. Missing Number
// https://leetcode.com/problems/missing-number/

// Uses gauss Formula
// http://mathcentral.uregina.ca/qq/database/qq.02.06/jo1.html

public class Solution {
    public int missingNumber(int[] nums) {
        //Gauss Formula
        int expectedSum = nums.length*(nums.length+1)/2;
        int actualSum=0;
        for (int num: nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
