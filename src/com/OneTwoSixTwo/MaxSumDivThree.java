package com.OneTwoSixTwo;

/**
 * Created by zhm on 2020/8/9.
 */
public class MaxSumDivThree {
    public static int maxSumDivThree(int[] nums) {
        int dp[][] = new int[nums.length][3];
        dp[0][nums[0] % 3] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int index1 = (nums[i] + dp[i - 1][0]) % 3;
            int index2 = (nums[i] + dp[i - 1][1]) % 3;
            int index3 = (nums[i] + dp[i - 1][2]) % 3;

            dp[i][index1] = Math.max(dp[i][index1], nums[i] + dp[i - 1][0]);
            dp[i][index2] = Math.max(dp[i][index2], nums[i] + dp[i - 1][1]);
            dp[i][index3] = Math.max(dp[i][index3], nums[i] + dp[i - 1][2]);

            dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i][1], dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i][2], dp[i - 1][2]);
        }
        return dp[nums.length - 1][0];
    }
}
