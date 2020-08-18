package com.ThreeFourThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhm on 2020/8/18.
 */
public class IntegerBreak {
    private int[] memo;

    public int integerBreak(int n) {
        memo = new int[n + 1];
        return breakInteger2(n);
    }

    //break n into at least two parts
    private int breakInteger2(int n) {
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            //求解memo[i]
            for (int j = 1; j <= i - 1; j++) {
                //j + (i - j)
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i - j]));
            }
        }

        return memo[n];
    }

    //break n into at least two parts
    //重叠子问题，记忆化搜索
    private int breakInteger1(int n) {

        if (n == 1) return 1;

        if (memo[n] != 0)
            return memo[n];

        int result = 0;
        for (int i = 1; i <= n - 1; i++) {
            result = Math.max(Math.max(result, i * (n - i)), i * breakInteger1(n - i));
        }
        memo[n] = result;

        return result;
    }
}
