package minimum_absolute_difference;


// 1200. Minimum Absolute Difference
// https://leetcode.com/problems/minimum-absolute-difference/

import java.util.*;

class Solution {
    // This is probably not the best memory optimized way of doing it, but only requires us to loop through the array given 1 time,
    // As opposed to 2 times, first to find the minimum difference and then  to find all pairs with that minimum difference
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        SortedMap<Integer, List<List<Integer>>> sm = new TreeMap<Integer, List<List<Integer>>>();
        // Sort array to find minimum difference between neighbor pairs.
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++){
            // Get each minimum diff, store in Pair List, and add that pair to a Sorted Map
            List<List<Integer>> arrFinal = new ArrayList<>();
            List<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i+1]);
            Integer key = arr[i+1] - arr[i];
            arrFinal.add(pair);
            // If the Sorted Map already has a key, we have to get it's value and add another pair to it
            if (sm.containsKey(key)) {
                List<List<Integer>> arrToAdd = sm.get(key);
                arrToAdd.add(pair);
                sm.put(key, arrToAdd);
                // Otherwise simply add the pair to the key
            } else {
                sm.put(key, arrFinal);
            }
        }
        // At the end get the first key of the Sorted Map (Means it's the minimum difference found)
        return sm.get(sm.firstKey());
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {4,2,1,3}; // expected [[1,2],[2,3],[3,4]]
        System.out.println(s.minimumAbsDifference(arr));
    }
}
