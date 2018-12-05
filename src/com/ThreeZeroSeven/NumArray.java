package com.ThreeZeroSeven;

/**
 * Created by zhm on 2018/12/5.
 */
class NumArray {
    private SegmentTree<Integer> segmentTree;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            Integer[] data = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                data[i] = nums[i];
            }

            segmentTree = new SegmentTree<>(data, (a, b) -> a + b);
        }
    }

    public void update(int i, int val) {
        if (segmentTree == null)
            throw new IllegalArgumentException("Segment tree is empty");
        segmentTree.set(i, val);
    }

    public int sumRange(int i, int j) {
        if (segmentTree == null)
            throw new IllegalArgumentException("Segment tree is empty");
        return segmentTree.query(i, j);
    }
}
