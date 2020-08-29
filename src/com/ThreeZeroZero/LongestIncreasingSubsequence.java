package com.ThreeZeroZero;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhm on 2020/8/29.
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int[] memo = new int[nums.length];
        Arrays.fill(memo, 1);


        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    memo[i] = Math.max(memo[i], memo[j] + 1);
                }
            }
        }

        int result = 1;
        for (int len : memo) {
            result = Math.max(result, len);
        }

        return result;
    }
}
