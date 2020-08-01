package com.EightEight;

/**
 * Created by zhm on 2020/7/31.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, index = m + n - 1; index >= 0; index--) {
            if (j < 0) {
                break;
            }
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[index] = nums1[i--];
            } else {
                nums1[index] = nums2[j--];
            }
        }
        //If can use another array
        /*int[] result = new int[m + n];

        for (int i = 0, j = 0, index = 0; index < m + n; index++) {
            if (i == m) {
                result[index] = nums2[j++];
            } else if (j == n) {
                result[index] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                result[index] = nums1[i++];
            } else if (nums1[i] >= nums2[j]) {
                result[index] = nums2[j++];
            }
        }
        return result;*/
    }
}
