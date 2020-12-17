// 657. Robot Return to Origin
// https://leetcode.com/problems/robot-return-to-origin/

/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function (moves) {
// Store possible moves in an object
	let possibleMoves = {
		U: [0, 1],
		D: [0, -1],
		R: [1, 0],
		L: [-1, 0],
	};
  // Split moves into an array
	let moveList = moves.split('');
  // Variable to store final move
	let finalMove = [0, 0];
  // Go through each move and sum to the finalMove
	for (const move of moveList) {
		let currentMove = possibleMoves[move];
		finalMove[0] += currentMove[0];
		finalMove[1] += currentMove[1];
	}
	if (finalMove[0] == 0 && finalMove[1] == 0) {
		return true;
	} else {
		return false;
	}
};