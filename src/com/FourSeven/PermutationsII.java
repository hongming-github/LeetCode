package com.FourSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhm on 2020/10/14.
 */
public class PermutationsII {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length != 0) {
            Arrays.sort(nums);
            generatePermutations(nums, 0, new ArrayList<>(), new boolean[nums.length]);
        }
        return result;
    }

    private void generatePermutations(int[] nums, int index, List<Integer> p, boolean[] used) {
        if (index == nums.length) {
            result.add(new ArrayList<>(p));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            p.add(nums[i]);
            used[i] = true;
            generatePermutations(nums, index + 1, p, used);
            p.remove(p.size() - 1);
            used[i] = false;
        }
    }
}
