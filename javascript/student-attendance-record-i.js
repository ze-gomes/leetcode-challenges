
// 551. Student Attendance Record I
// https://leetcode.com/problems/student-attendance-record-i/


/**
 * @param {string} s
 * @return {boolean}
 */
var checkRecord = function(s) {
      return !/(A.*A|LLL)/.test(s);
};
