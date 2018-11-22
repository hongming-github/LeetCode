package com.FourZeroFour;

/**
 * Created by zhm on 2018/11/22.
 */
public class SumofLeftLeaves {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left != null && isLeafNode(root.left)) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
