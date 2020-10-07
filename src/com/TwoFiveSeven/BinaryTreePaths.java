package com.TwoFiveSeven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhm on 2020/10/7.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        if (root.left == null && root.right == null) {
            result.add(root.val + "");
            return result;
        }

        binaryTreePaths(root.left).forEach(s -> result.add(root.val + "->" + s));
        binaryTreePaths(root.right).forEach(s -> result.add(root.val + "->" + s));

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
