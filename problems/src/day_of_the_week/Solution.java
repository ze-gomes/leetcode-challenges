package day_of_the_week;


// 1185. Day of the Week
// https://leetcode.com/problems/day-of-the-week/

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // 1 Jan 1971 (when the interval starts) is a Friday, start day of the weeks on a Friday
        String[] dayWeek = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        // Initialize days of the months
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // check if year is leap and change the day of the corresponding month
        if (isLeap(year))
            monthDays[1] = 29;
        int sum = 0;
        // Sum all past years
        for (int i=1971; i<year; i++){
            if (isLeap(i)) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        // Sum all past months only (hence month-1)
        for (int i=0; i<month-1; i++){
                sum += monthDays[i];
        }
        // Sum days passed but not the current day (hence day-1)
        sum += day -1;
        // Remainder of Division of Sum by 7 is the extra days you need to add to Friday
        return dayWeek[sum%7];
    }

    // Check if year is leap
    public boolean isLeap(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                   return false;
            } else
                return true;
        } else {
           return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.dayOfTheWeek(18,  7,  1999));
        System.out.println(s.isLeap(2020));
    }

}