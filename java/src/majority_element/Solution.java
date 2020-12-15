package majority_element;

//  169. Majority Element
// https://leetcode.com/problems/majority-element/


import java.util.HashMap;
import java.util.Map;

class Solution {
    // Create hashmap to store n of occorrences for each number
    HashMap<Integer, Integer> mapCounter = new HashMap<>();
    public int majorityElement(int[] nums) {
        for (int i=0; i< nums.length; i++){
            // Increments number of occorrences per key (number)
            int counter = mapCounter.containsKey(nums[i]) ? mapCounter.get(nums[i]) : 0;
            mapCounter.put(nums[i], counter + 1);
        }
        int numOccurrences = 0;
        int numberMajority=0;
        // Iterate through hashmap to find the key with highest number of occorrences
        for (Map.Entry<Integer, Integer> n: mapCounter.entrySet()) {
            Integer number = n.getKey();
            Integer numTimes = n.getValue();
            if (numTimes > numOccurrences){
                numOccurrences = numTimes;
                numberMajority = number;
            }
        }
        return numberMajority;
    }


    // Tests
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {3,3,4};
        System.out.println(s.majorityElement(array));
    }
}