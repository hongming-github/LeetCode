package com.ThreeFourSeven;

import java.util.*;

/**
 * Created by zhm on 2018/12/4.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> freq.get(a) - freq.get(b));

        for (int key : freq.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else {
                if (freq.get(key).compareTo(freq.get(pq.peek())) > 0) {
                    pq.remove();
                    pq.add(key);
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            result[i] = pq.remove();
        }

        return result;
    }
}
