package com.OneFourSevenZero;

/**
 * Created by zhm on 2020/8/9.
 */
public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0, j = n, index = 0; i < n && j < 2 * n; i++, j++) {
            result[index++] = nums[i];
            result[index++] = nums[j];
        }
        return result;
    }
}
