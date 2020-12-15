package find_positive_integer_solution_for_a_given_equation;

/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */


// 1237. Find Positive Integer Solution for a Given Equation
// https://leetcode.com/problems/find-positive-integer-solution-for-a-given-equation/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> arrFinal = new ArrayList<>();
        for (int i=1; i<=1000; i++){
            for (int u=1; u<=1000; u++){
                if (customfunction.f(i,u) == z){
                    List<Integer> pair = new ArrayList<Integer>();
                    pair.add(i);
                    pair.add(u);
                    arrFinal.add(pair);
                }
            }
        }
        return arrFinal;

    }


    // Filler to avoid compilation errors, CustomFunction is a given class which we dont know the implementation
    private class CustomFunction {
        public int f(int i, int u){
            return 0;
        }
    }
}