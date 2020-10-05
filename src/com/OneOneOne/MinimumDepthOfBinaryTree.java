package com.OneOneOne;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhm on 2020/9/28.
 */
public class MinimumDepthOfBinaryTree {
    //BFS
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int minDepth = 0;
        while (!q.isEmpty()) {
            minDepth++;
            int count = 0;
            int levelSize = q.size();
            while (count < levelSize) {
                TreeNode node = q.poll();
                count++;
                TreeNode leftNode = node.left;
                TreeNode rightNode = node.right;
                if (leftNode == null && rightNode == null) return minDepth;
                if (leftNode != null) q.offer(leftNode);
                if (rightNode != null) q.offer(rightNode);
            }
        }
        return minDepth;
    }


    /*
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
    }*/

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
