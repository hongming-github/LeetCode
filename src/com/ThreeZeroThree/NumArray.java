package com.ThreeZeroThree;

/**
 * Created by zhm on 2018/12/5.
 */
class NumArray {
    private int[] arr;

    public NumArray(int[] nums) {
        arr = new int[nums.length + 1];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return arr[j + 1] - arr[i];
    }
}
