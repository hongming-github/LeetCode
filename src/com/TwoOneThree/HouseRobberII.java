package com.TwoOneThree;

/**
 * Created by zhm on 2020/8/22.
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        //[0...n-2]    [1...n-1]
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int n = end + 1;

        int[] memo = new int[n];

        memo[start] = nums[start];

        for (int i = start + 1; i <= end; i++) {
            memo[i] = Math.max(nums[i] + (i - 2 >= 0 ? memo[i - 2] : 0), memo[i - 1]);
        }
        return memo[end];
    }
}
