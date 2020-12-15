// 523. Continuous Subarray Sum
// https://leetcode.com/problems/continuous-subarray-sum/

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var checkSubarraySum = function(nums, k) {
    // Check all possible subArrays
    for (i=0; i<nums.length; i++) {
        for(j=i+1; j<nums.length; j++){
            // slice j+1 to include elem at index j
            let temparray = nums.slice(i,j+1);
            // Sum all numbers in subarray
            let sumSubArray = temparray.reduce((a, b) => a + b, 0);
            // Test for sum/multiple of 0
            if (sumSubArray == 0 && k == 0){
                return true;
            }
            // Test for all other sum multiples
            else if ( sumSubArray % k == 0){
                return true;
            }
        }
    }
    return false;
};