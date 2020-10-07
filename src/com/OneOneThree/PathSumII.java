package com.OneOneThree;

import com.TwoFiveSeven.BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhm on 2020/10/7.
 */
public class PathSumII {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    //优化后
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return result;

        temp.add(root.val);

        if (root.left == null && root.right == null && root.val == sum) {
            result.add(new ArrayList<>(temp));
        }

        pathSum(root.left, sum - root.val);
        pathSum(root.right, sum - root.val);

        //Need to remove last child node before traversing back to partner node
        temp.remove(temp.size() - 1);

        return result;
    }
    /*
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        if (root.left == null && root.right == null) {
            List<Integer> temp;
            if (root.val == sum) {
                temp = new ArrayList<>();
                temp.add(root.val);
                result.add(temp);
            }
            return result;
        }

        pathSum(root.left, sum - root.val).forEach(val -> {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            temp.addAll(val);
            result.add(temp);
        });

        pathSum(root.right, sum - root.val).forEach(val -> {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            temp.addAll(val);
            result.add(temp);
        });

        return result;
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
