package com.OneFiveOneTwo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhm on 2020/8/9.
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        for (int count : counts) {
            result += count * (count - 1) / 2;
        }
        return result;
    }
}
