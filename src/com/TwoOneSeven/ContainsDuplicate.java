package com.TwoOneSeven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhm on 2020/9/9.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> record = new HashSet<>();
        for (int num : nums) {
            if (record.contains(num)) {
                return true;
            } else {
                record.add(num);
            }
        }
        return false;
    }
}
