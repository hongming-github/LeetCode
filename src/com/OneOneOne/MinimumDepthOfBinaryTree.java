package com.OneOneOne;

/**
 * Created by zhm on 2020/9/28.
 */
public class MinimumDepthOfBinaryTree {
    //DFS
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int minLeft = minDepth(root.left) + 1;
        int minRight = minDepth(root.right) + 1;

        if (root.right == null) {
            return minLeft;
        }
        if (root.left == null) {
            return minRight;
        }
        return Math.min(minLeft, minRight);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
