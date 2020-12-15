package add_digits;

// 258. Add Digits
// https://leetcode.com/problems/add-digits/

// Divide by 10  and add the remaider by 10 to sum the last number to the first one

public class Solution {
    public int addDigits(int num) {
        while (num>9){
            num = (num/10) + (num%10);
        }
        return num;
    }
}
