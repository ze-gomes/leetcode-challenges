package number_of_good_ways_to_split_a_string;

class Solution {
    public int numSplits(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(1, i);
            String s2 = s.substring(i);
            if (countDiffCharacters(s1) == countDiffCharacters(s2)) {
                result++;
            }
        }
        return result;
    }

    public int countDiffCharacters(String s) {
        int diffChars = 0;
        for (int i = 0; i < s.length(); i++) {
            String ch = Character.toString(s.charAt(i));
            int indexResult = s.indexOf(ch, i+1);
            int beforeIndexResult  = s.indexOf(ch);
            // System.out.println(ch + " CHAR " + beforeIndexResult + "  at i  " + i );
            if ((indexResult == -1) && (beforeIndexResult<=i)) {
                diffChars++;
            }
        }
        return diffChars;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countDiffCharacters("AABBS")); // Expected 3
    }
}