package day_of_the_year;

// 1154. Day of the Year
// https://leetcode.com/problems/day-of-the-year/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Solution {
    public int dayOfYear(String date) {
        int dayOfYear=0;
        try {
            Calendar calendar = Calendar.getInstance();
            // Parse date to correct format
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            // Get day of the year with Calendar object
            dayOfYear = calendar.get(calendar.DAY_OF_YEAR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dayOfYear;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.dayOfYear("2003-03-01"));
    }
}