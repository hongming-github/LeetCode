package com.TwoOneNine;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhm on 2020/9/9.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> record = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.contains(nums[i])) {
                return true;
            } else {
                record.add(nums[i]);
                if (record.size() > k)
                    record.remove(nums[i - k]);

            }
        }
        return false;
    }

}
