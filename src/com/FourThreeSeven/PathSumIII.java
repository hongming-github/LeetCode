package com.FourThreeSeven;

import com.OneOneThree.PathSumII;

/**
 * Created by zhm on 2020/10/10.
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;

        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int findPath(TreeNode root, int sum) {
        if (root == null) return 0;

        int result = 0;
        if (root.val == sum)
            result += 1;

        result += findPath(root.left, sum - root.val);
        result += findPath(root.right, sum - root.val);

        return result;
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
