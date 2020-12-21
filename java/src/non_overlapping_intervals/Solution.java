package non_overlapping_intervals;

// 435. Non-overlapping Intervals
// https://leetcode.com/problems/non-overlapping-intervals/

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort array first from the last element
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        // Use linkedList to store resulting intervals
        LinkedList<int[]> listIntervals = new LinkedList<>();
        for ( int[] interval : intervals){
            // Only add non overlapping intervals
            if (listIntervals.isEmpty() || (listIntervals.getLast()[1] <= interval[0])){
                listIntervals.addLast(interval);
            }
        }
        // get difference of length from list to original array as the result
        return intervals.length - listIntervals.size();
    }
}