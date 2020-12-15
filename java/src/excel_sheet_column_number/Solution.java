package excel_sheet_column_number;

// 171. Excel Sheet Column Number
// https://leetcode.com/problems/excel-sheet-column-number/

import java.util.Arrays;

class Solution {
    public static int titleToNumber(String s) {
        // Split each char into an array
        String[] arrayColumns = s.split("");
        //Store total value of column
        int sumTotalLetters = 0;
        // Interate over array, convert to char each element
        for (int i=0; i< arrayColumns.length; i++) {
            char letter = arrayColumns[i].charAt(0);
            int valueLetter = letter;
            valueLetter = (valueLetter - 64) + (i * 26);
            sumTotalLetters += valueLetter;
        }
        return sumTotalLetters;
    }




    public static void main(String args[]) {
        System.out.println(titleToNumber("ZY"));
    }
}