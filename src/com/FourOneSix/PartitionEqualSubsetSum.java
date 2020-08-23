package com.FourOneSix;

import java.util.Arrays;

/**
 * Created by zhm on 2020/8/23.
 */
public class PartitionEqualSubsetSum {
    private int[][] memo;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0)
            return false;

        int n = nums.length;
        int C = sum / 2;
        boolean[] memo = new boolean[C + 1];

        for (int i = 0; i <= C; i++) {
            memo[i] = (nums[0] == i);
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] == C) return true;
            if (nums[i] > C) return false;
            for (int j = C; j >= nums[i]; j--) {
                memo[j] = memo[j] || memo[j - nums[i]];
            }
        }

        return memo[C];
    }

    //递归 记忆化搜索
    public boolean canPartition1(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0)
            return false;

        memo = new int[nums.length][sum / 2 + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return tryPartition(nums, nums.length - 1, sum / 2);
    }

    private boolean tryPartition(int[] nums, int index, int sum) {
        if (sum == 0)
            return true;

        if (sum < 0 || index < 0)
            return false;

        if (memo[index][sum] != -1)
            return memo[index][sum] == 1;

        memo[index][sum] = (tryPartition(nums, index - 1, sum) || tryPartition(nums, index - 1, sum - nums[index])) ? 1 : 0;

        return memo[index][sum] == 1;
    }
}
