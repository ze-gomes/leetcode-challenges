package reformat_date;

import java.util.Arrays;
import java.util.List;

// 1507. Reformat Date
// https://leetcode.com/problems/reformat-date

public class Solution {
    public String reformatDate(String date) {
        String[] Month = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        List<String> list = Arrays.asList(Month);

        String[] split = date.split("\\s+");
        String day = split[0].replaceAll("\\D", "");
        int month = list.indexOf(split[1]);

        return split[2] + "-" + String.format("%02d", month) + "-" + String.format("%02d", Integer.parseInt(day));
    }
}
