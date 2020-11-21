package distribute_candies;

// 575. Distribute Candies
// https://leetcode.com/problems/distribute-candies/

import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {

        // Create a HashSet object for types of candies
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < candyType.length; i++) {
            // Go through the array, If the type of candy is not in the hashset yet, add it
            if (!numbers.contains(candyType[i])) {
                numbers.add(candyType[i]);
            }
        }
        // Size of hashset is the number of diff candies,
        // which can never be bigger than candyType.length / 2
        int typesOfCandies = numbers.size();
        if (typesOfCandies > candyType.length / 2) {
            typesOfCandies = candyType.length / 2;
        }
        return typesOfCandies;
    }
}
