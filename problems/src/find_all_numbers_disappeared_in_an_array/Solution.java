package find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int current = nums[0];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (current == nums[i] && !found) {
                list.remove(Integer.valueOf(nums[i]));
                found = true;
            } else if (current != nums[i]) {
                current = nums[i];
                found = false;
            }
        }
        for (int i=0; i< nums.length; i++) {
            if i
        }
        return list;
    }
}