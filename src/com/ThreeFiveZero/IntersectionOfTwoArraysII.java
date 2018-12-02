package com.ThreeFiveZero;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by zhm on 2018/12/2.
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num1 : nums1) {
            if (!map.containsKey(num1)) {
                map.put(num1, 1);
            } else {
                map.put(num1, map.get(num1) + 1);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num2 : nums2) {
            if (map.containsKey(num2)) {
                resultList.add(num2);
                map.put(num2, map.get(num2) - 1);
                if (map.get(num2) == 0)
                    map.remove(num2);
            }
        }

        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
