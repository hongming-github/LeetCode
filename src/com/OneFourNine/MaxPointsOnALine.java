package com.OneFourNine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhm on 2020/9/5.
 */
public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        if (points.length < 3) {
            return points.length;
        }
        int result = 0;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> normalMap = new HashMap<>();
            int duplicate = 0;
            int max = 0;
            for (int j = i + 1; j < points.length; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                if (x1 == x2 && y1 == y2) {
                    duplicate++;
                } else {
                    int deltaY = y2 - y1, deltaX = x2 - x1;
                    int gcd = gcd(deltaY, deltaX);
                    String s = String.valueOf(deltaY / gcd) + String.valueOf(deltaX / gcd);
                    normalMap.put(s, normalMap.getOrDefault(s, 0) + 1);
                    max = Math.max(max, normalMap.get(s));
                }
            }
            result = Math.max(result, max + duplicate + 1);
        }
        return result;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
