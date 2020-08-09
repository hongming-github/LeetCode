package com.SevenFive;

/**
 * Created by zhm on 2020/8/9.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zero = -1, two = nums.length;
        //[0,zero]....i...[two,len-1]
        for (int i = 0; i < two; ) {
            if (nums[i] == 0) {
                nums[i++] = nums[++zero];
                nums[zero] = 0;
            } else if (nums[i] == 1) {
                i++;
            } else {
                nums[i] = nums[--two];
                nums[two] = 2;
            }
        }
    }
}
