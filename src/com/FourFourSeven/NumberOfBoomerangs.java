package com.FourFourSeven;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhm on 2020/9/5.
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;

        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    map.put(dis(points[i], points[j]), map.getOrDefault(dis(points[i], points[j]), 0) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                result += entry.getValue() * (entry.getValue() - 1);
            }
        }

        return result;
    }

    private int dis(int[] pointA, int[] pointB) {
        return (pointA[0] - pointB[0]) * (pointA[0] - pointB[0])
                + (pointA[0] - pointB[0]) * (pointA[1] - pointB[1]);
    }
}
