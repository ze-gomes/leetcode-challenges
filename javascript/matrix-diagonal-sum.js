// 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/


/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    let diagonal1 = 0;
    let diagonal2 = 0;
    for (let row = 0; row < mat.length; row++) {
        diagonal1 += mat[row][row];
        diagonal2 += mat[row][mat.length-row-1];
    }
    // Remove duplicated mid matrix index (common to both diagonals) in case the size is odd number
    if (mat.length%2 == 0){
         return diagonal1+diagonal2;
    } else {
         let midIndex = Math.round((mat.length-1)/2);
         return diagonal1+diagonal2 - mat[midIndex][midIndex];
    }
};