package fibonacci_number;

// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/


class Solution {
    // Get Fibonnacci number corresponding to N
    public int fib(int N) {
        if (N == 1){
            return 1;
        } else if (N==0){
            return 0;
        } else {
            return fib(N-1) + fib(N-2);
        }

    }
}