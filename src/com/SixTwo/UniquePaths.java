package com.SixTwo;

import java.util.Arrays;

/**
 * Created by zhm on 2020/8/19.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, 1);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
