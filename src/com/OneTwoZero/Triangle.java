package com.OneTwoZero;

import java.util.List;

/**
 * Created by zhm on 2020/11/2.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();

        int[] memo = new int[m];

        for (int i = 0; i < triangle.get(m - 1).size(); i++) {
            memo[i] = triangle.get(m - 1).get(i);
        }

        for (int i = m - 2; i >= 0; i--) {
            List<Integer> cur = triangle.get(i);
            for (int j = 0; j < cur.size(); j++) {
                //current value and below adjacent values
                memo[j] = Math.min(memo[j], memo[j + 1]) + cur.get(j);
            }
        }

        return memo[0];
    }
}
