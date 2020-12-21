package merge_intervals;

import java.util.Arrays;
import java.util.LinkedList;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/


class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> listIntervals = new LinkedList<>();
        for ( int[] interval : intervals){
            // Add interval in this case
            if (listIntervals.isEmpty() || (listIntervals.getLast()[1] < interval[0])){
                listIntervals.addLast(interval);
                // Edit overlapping interval
            } else if (listIntervals.getLast()[1] <= interval[1]) {
                listIntervals.getLast()[1] = interval[1];
            }
        }
        // Revert back to array
        return listIntervals.toArray(new int[listIntervals.size()][]);
    }
}