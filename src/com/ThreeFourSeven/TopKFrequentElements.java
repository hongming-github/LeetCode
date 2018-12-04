package com.ThreeFourSeven;

import java.util.*;

/**
 * Created by zhm on 2018/12/4.
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : nums) {
            if (treeMap.containsKey(num)) {
                treeMap.put(num, treeMap.get(num) + 1);
            } else {
                treeMap.put(num, 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return treeMap.get(a) - treeMap.get(b);
            }
        });

        for (int key : treeMap.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else {
                if (treeMap.get(key).compareTo(treeMap.get(pq.peek())) > 0) {
                    pq.remove();
                    pq.add(key);
                }
            }
        }

        List<Integer> resultList = new ArrayList<>();

        while (!pq.isEmpty()) {
            resultList.add(pq.remove());
        }

        return resultList;
    }
}
