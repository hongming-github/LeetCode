package com.TwoSix;

/**
 * Created by zhm on 2020/8/2.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0, len = nums.length;
        for (int j = i + 1; j < len && nums[i] != nums[len - 1]; j++) {
            if (nums[i] < nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
