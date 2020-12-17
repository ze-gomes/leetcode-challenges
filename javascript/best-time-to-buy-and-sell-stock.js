// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let max = 0;
    let min = Number.MAX_SAFE_INTEGER;
    for (let i=0; i<prices.length; i++){
        min = Math.min(prices[i], min);
        max = Math.max(prices[i]- min, max );
    }
    return max;
};