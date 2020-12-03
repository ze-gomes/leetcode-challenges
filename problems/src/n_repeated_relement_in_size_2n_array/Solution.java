package n_repeated_relement_in_size_2n_array;

import java.util.Arrays;

// 961. N-Repeated Element in Size 2N Array
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/



class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int nOccurences = 1;
        int length = A.length;
        // Sort array and as soon as it finds an element with length/2 occurrences, return that element
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && A[i] == A[i + 1]) {
                nOccurences++;
            }
            if (nOccurences == length / 2) {
                return A[i];
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(s.repeatedNTimes(arr));
    }
}