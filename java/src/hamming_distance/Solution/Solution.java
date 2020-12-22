package hamming_distance.Solution;

import java.util.Arrays;

// 461. Hamming Distance
// https://leetcode.com/problems/hamming-distance/

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.hammingDistance(10, 2);
    }

    public int hammingDistance(int x, int y) {
        // Get binary representation
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        // Prefix 0's to the smaller number (to make it the same size)
        char zeroPrefix = '0';
        int sizeDiff = Math.abs(binaryX.length() - binaryY.length());
        char[] repeatZeros = new char[sizeDiff];
        Arrays.fill(repeatZeros, zeroPrefix);
        if (x>y) {
            binaryY = new String(repeatZeros) + binaryY;
        } else {
            binaryX = new String(repeatZeros) + binaryX;
        }
        int bitDiffCount = 0;
        // Run through both strings at same time and count char differences
        for (int i = 0; i< binaryX.length(); i++){
            if (binaryX.charAt(i) != binaryY.charAt(i)){
                bitDiffCount++;
            }
        }
        return bitDiffCount;
    }
}