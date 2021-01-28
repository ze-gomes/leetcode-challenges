
// 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/

/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    const array = n.toString().split("").map( x => +x);
    return array.reduce((a, b) => a * b) - array.reduce((a, b) => a + b);
};