package com.SixFour;

import java.util.Arrays;

/**
 * Created by zhm on 2020/11/5.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int row = 1; row < m; row++) {
            grid[row][0] += grid[row - 1][0];
        }

        for (int col = 1; col < n; col++) {
            grid[0][col] += grid[0][col - 1];

        }

        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                grid[row][col] += Math.min(grid[row][col - 1], grid[row - 1][col]);
            }
        }

        return grid[m - 1][n - 1];
    }
}
