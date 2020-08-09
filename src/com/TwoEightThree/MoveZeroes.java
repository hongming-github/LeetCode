package com.TwoEightThree;

/**
 * Created by zhm on 2020/8/8.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0, index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                if (i != index) {
                    int temp = nums[i];
                    nums[i++] = nums[index];
                    nums[index] = temp;
                } else {
                    i++;
                }
            }
        }
    }
}
