package com.TwoTwoZero;

import java.util.TreeSet;

/**
 * Created by zhm on 2020/9/10.
 */
public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> record = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.ceiling((long) nums[i] - (long) t) != null && record.ceiling((long) nums[i] - (long) t) <= nums[i] + (long) t) {
                return true;
            } else {
                record.add((long) nums[i]);
                if (record.size() > k) {
                    record.remove((long) nums[i - k]);
                }
            }
        }
        return false;
    }
}
