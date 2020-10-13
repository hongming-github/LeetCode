package com.FourSix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhm on 2020/10/13.
 */
public class Permutations {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> p = new ArrayList<>();
        if (nums.length != 0)
            generatePermutations(nums, 0, p);
        return result;
    }

    private void generatePermutations(int[] nums, int index, List<Integer> p) {
        if (index == nums.length) {
            result.add(new ArrayList<>(p));
            return;
        }

        for (int num : nums) {
            if (!p.contains(num)) {
                p.add(num);
                generatePermutations(nums, index + 1, p);
                p.remove(p.size() - 1);
            }
        }

    }
}
