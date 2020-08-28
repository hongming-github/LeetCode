package com.TwoZeroNine;

/**
 * Created by zhm on 2020/8/28.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;
        int sum = 0, len = nums.length;
        int result = len + 1;

        while (l < len) {
            if (r + 1 < len && sum < s) {
                r++;
                sum += nums[r];
            } else if (sum >= s) {
                result = Math.min(result, r - l + 1);
                sum -= nums[l];
                l++;
            } else {
                break;
            }
        }

        return result == len + 1 ? 0 : result;
    }
}
