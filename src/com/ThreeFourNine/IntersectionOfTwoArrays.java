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

        TreeSet<Integer> resultSet = new TreeSet<>();

        for (int num2 : nums2) {
            if (set.contains(num2)) {
                resultSet.add(num2);
            }
        }

        int[] result = new int[resultSet.size()];

        int index = 0;
        for (Integer res : resultSet) {
            result[index++] = res;
        }

        return result;
    }
}
