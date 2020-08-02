package com.TwoSix;

/**
 * Created by zhm on 2020/8/2.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (nums[i] < n) {
                nums[i + 1] = n;
                i++;
            }
        }
        return i + 1;
    }
}
