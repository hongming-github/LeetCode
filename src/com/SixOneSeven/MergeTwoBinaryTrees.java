package com.SixOneSeven;

/**
 * Created by zhm on 2018/11/22.
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode resultRoot = preOrder(t1, t2);
        return resultRoot;
    }

    private TreeNode preOrder(TreeNode t1, TreeNode t2) {

        if (t1 != null || t2 != null) {
            int val1 = t1 == null ? 0 : t1.val;
            int val2 = t2 == null ? 0 : t2.val;
            TreeNode newNode = new TreeNode(val1 + val2);
            newNode.left = preOrder(getLeftChildNode(t1), getLeftChildNode(t2));
            newNode.right = preOrder(getRightChildNode(t1), getRightChildNode(t2));

            return newNode;
        }
        return null;
    }

    private TreeNode getLeftChildNode(TreeNode node) {
        return node == null ? null : node.left;
    }

    private TreeNode getRightChildNode(TreeNode node) {
        return node == null ? null : node.right;
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
