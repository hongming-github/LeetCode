package com.FourFiveFour;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhm on 2020/9/3.
 */
public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }

        int result = 0;
        for (int c : C) {
            for (int d : D) {
                result += map.getOrDefault(-c - d, 0);
            }
        }
        return result;
    }
}
