package com.TwoFourTwo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhm on 2020/9/3.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] ab = new int[128];
        for (char c : s.toCharArray()) {
            ab[c]++;
        }
        for (char c : t.toCharArray()) {
            ab[c]--;
        }
        for (int freq : ab) {
            if (freq != 0) return false;
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : t.toCharArray()) {
//            if (map.containsKey(c)) {
//                int count = map.get(c);
//                if (count == 1) {
//                    map.remove(c);
//                } else {
//                    map.put(c, count - 1);
//                }
//            }
//        }
//
//        return map.isEmpty();
//    }
}
