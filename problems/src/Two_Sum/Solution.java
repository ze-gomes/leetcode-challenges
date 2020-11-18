package Two_Sum;

//  Two Sum - LeetCode https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] numsResult = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int u = 0; u < nums.length; u++) {
                if ((i != u) && (nums[i]+nums[u] == target)){
                    numsResult[0] = i;
                    numsResult[1] = u;
                    return numsResult;

                }

            }

        }
        return numsResult;
    }
}