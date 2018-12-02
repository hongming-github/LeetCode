package com.ThreeFourNine;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by zhm on 2018/12/2.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int num1 : nums1) {
            set.add(num1);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int num2 : nums2) {
            if (set.contains(num2)) {
                resultList.add(num2);
                set.remove(num2);
            }
        }

        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
