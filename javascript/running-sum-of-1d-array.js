// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    for (let i=0; i<nums.length; i++ ){
        if (i == 0){
            continue;
        } else {
            nums[i] = nums[i-1] + nums[i];
        }
    }
    return nums;
    
};
