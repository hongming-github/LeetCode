package com.SevenSeven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhm on 2020/10/18.
 */
public class Combinations {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || k > n)
            return result;

        generateCombinations(n, k, 1, new ArrayList<>());
        return result;
    }

    private void generateCombinations(int n, int k, int start, List<Integer> c) {
        if (c.size() == k) {
            result.add(new ArrayList<>(c));
            return;
        }

        //还有k - c.size()个空位，所以，[i...n]中至少要有k - c.size()个元素
        //i最多为 n - (k - c.size()) + 1
        for (int i = start; i <= n - (k - c.size()) + 1; i++) {
            c.add(i);
            generateCombinations(n, k, i + 1, c);
            c.remove(c.size() - 1);
        }

    }
}
