// https://leetcode.com/problems/shuffle-the-array/
// 1470. Shuffle the Array


/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    var results = [];
    while (nums.length) {
        results.push(nums.splice(0, n));
    }
    var final = [];
    for (let i = 0; i<n; i++){
        final.push(results[0][i]);
        final.push(results[1][i]);
    }
    return final;
};