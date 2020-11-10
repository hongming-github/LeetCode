package com.FourFiveFive;

import java.util.Arrays;

/**
 * Created by zhm on 2020/11/10.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1;
        int j = s.length - 1;
        int result = 0;
        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                j--;
                i--;
                result++;
            } else {
                i--;
            }
        }
        return result;
    }
}
