package com.TwoSevenNine;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhm on 2020/9/21.
 */
public class PerfectSquares {
    public int numSquares(int n) {
        if (n == 0) return 0;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(n, 0));

        boolean[] visited = new boolean[n + 1];
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> pair = queue.poll();
            int num = pair.getKey();
            int step = pair.getValue();

            for (int i = 1; ; i++) {
                int a = num - i * i;
                if (a < 0) break;
                if (a == 0) return step + 1;
                if (!visited[a]) {
                    queue.add(new Pair<>(a, step + 1));
                    visited[a] = true;
                }
            }
        }
        return -1;
    }
}