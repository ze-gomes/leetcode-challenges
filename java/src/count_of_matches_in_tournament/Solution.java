package count_of_matches_in_tournament;

// 1688. Count of Matches in Tournament
// https://leetcode.com/problems/count-of-matches-in-tournament/

// You are given an integer n, the number of teams in a tournament that has strange rules:
//
//If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
//If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired.
// A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.

class Solution {
    public int numberOfMatches(int n) {
        int numberOfMatches = 0;
        // If theres more than one team, keep playing
        while (n>1) {
            if (n%2 == 0) {
                numberOfMatches += n/2;
                n = n/2;
            } else {
                numberOfMatches += (n-1)/2;
                n = (n-1) /2+1;
            }
        }
        return numberOfMatches;
    }
}