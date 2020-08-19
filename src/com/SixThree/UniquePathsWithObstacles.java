package com.SixThree;

/**
 * Created by zhm on 2020/8/19.
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if (obstacleGrid[m - 1][n - 1] == 1) return 0;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                if (n == 1) return 0;
                else break;
            } else {
                dp[i][0] = 1;
            }
        }

        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                if (m == 1) return 0;
                else break;
            } else {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
