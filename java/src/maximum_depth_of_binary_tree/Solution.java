package maximum_depth_of_binary_tree;

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree


  // Solution with recursivity
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // Break the tree into halfs recursively and add 1 each time.
        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
