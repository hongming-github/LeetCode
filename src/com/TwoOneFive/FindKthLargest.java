package com.TwoOneFive;

/**
 * Created by zhm on 2020/8/9.
 */
public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        return findKthSmallest(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int findKthSmallest(int[] nums, int l, int r, int k) {
        if (l == r)
            return nums[l];

        //[l+1,j]<v  [j+1,r]>v
        int target = nums[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] < target) {
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        //[l,j-1]j [j+1,r]
        int temp = nums[l];
        nums[l] = nums[j];
        nums[j] = temp;

        if (j < k) {
            return findKthSmallest(nums, j + 1, r, k);
        } else if (j > k) {
            return findKthSmallest(nums, l, j - 1, k);
        } else {
            return nums[j];
        }
    }
}
/*
 for (int i = l + 1; i <= r; ) {
            if (nums[i] < target) {
                int temp = nums[i];
                nums[i] = nums[lt + 1];
                nums[lt + 1] = temp;
                i++;
                lt++;
            } else if (nums[i] == target) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[gt - 1];
                nums[gt - 1] = temp;
                gt--;
            }
        }
* */