package reverse_words_in_a_string_iii;

// 557. Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class Solution {
        public String reverseWords(String s) {
            String[] splitString = s.split(" ");
            String result= "";
            for (String word : splitString) {
                // conversion from String object to StringBuffer
                StringBuffer sbr = new StringBuffer(word);
                // To reverse the string
                sbr.reverse();
                result += sbr + " ";
            }
            // Trim space at the end
            return result.trim();
        }
}

