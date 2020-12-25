
// https://leetcode.com/problems/custom-sort-string/
// 791. Custom Sort String

/**
 * @param {string} S
 * @param {string} T
 * @return {string}
 */
var customSortString = (S, T) =>
  T.split('')
    .sort((a, b) => S.indexOf(a) - S.indexOf(b))
    .join('');