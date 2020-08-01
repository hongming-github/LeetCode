package com.One;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhm on 2020/8/2.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            } else {
                map.put(target - value, i);
            }
        }
        return null;
        /*
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
        */
    }
}
