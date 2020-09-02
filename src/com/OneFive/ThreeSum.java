package com.OneFive;

import java.util.*;

/**
 * Created by zhm on 2020/9/3.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int target = -nums[i];
                if (nums[l] + nums[r] == target) {
                    List<Integer> setList = new ArrayList<>();
                    setList.add(nums[i]);
                    setList.add(nums[l]);
                    setList.add(nums[r]);
                    result.add(setList);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
/*    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            map.clear();
            set.clear();
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                int value = nums[j];
                if (map.containsKey(value) && !set.contains(value)) {
                    List setList = new ArrayList<>();
                    setList.add(nums[i]);
                    setList.add(nums[map.get(value)]);
                    setList.add(value);
                    result.add(setList);
                    set.add(value);
                    map.remove(value);
                } else {
                    map.put(-nums[i] - value, j);
                }
            }
        }
        return result;
    }
    */
}
