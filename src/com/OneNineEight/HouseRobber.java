package com.OneNineEight;

/**
 * Created by zhm on 2020/8/20.
 */
public class HouseRobber {
    private int[] memo;

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        memo = new int[n];
        //memo[i]表示考虑抢劫 nums[0...n]所获得的最大收益
        memo[0] = nums[0];

        for (int i = 1; i < n; i++) {
            memo[i] = Math.max(nums[i] + (i - 2 >= 0 ? memo[i - 2] : 0), memo[i - 1]);
        }
        return memo[n - 1];
    }

    public int rob2(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        memo = new int[n];
        //memo[i]表示考虑抢劫 nums[i...n-1]所获得的最大收益
        memo[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            //memo[i]
            for (int j = i; j < n; j++) {
                memo[i] = Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));
            }
        }
        return memo[0];
    }

    //递归加记忆化搜索
    public int rob1(int[] nums) {
        memo = new int[nums.length];
        return tryRob(nums, 0);
    }

    private int tryRob(int[] nums, int index) {
        if (index >= nums.length)
            return 0;

        if (memo[index] != 0)
            return memo[index];

        int result = 0;
        for (int i = index; i < nums.length; i++) {
            result = Math.max(result, nums[i] + tryRob(nums, i + 2));
        }
        memo[index] = result;

        return result;
    }
}
