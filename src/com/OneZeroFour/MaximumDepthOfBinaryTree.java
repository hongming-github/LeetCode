package com.OneZeroFour;

/**
 * Created by zhm on 2018/11/22.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
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


