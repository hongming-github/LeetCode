package com.SevenZero;

import java.util.Arrays;

/**
 * Created by zhm on 2020/8/9.
 */
public class ClimbStairs {
    private int[] memo;

    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
    /*
    public int climbStairs(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return calculateWays(n);
    }

    private int calculateWays(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        if (memo[n] != -1)
            memo[n] = calculateWays(n - 1) + calculateWays(n - 2);

        return memo[n];
    }
    */
}
