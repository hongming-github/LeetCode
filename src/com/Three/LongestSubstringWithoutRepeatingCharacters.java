package com.Three;

/**
 * Created by zhm on 2020/8/29.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int l = 0, r = -1;
        int result = 1;
        int[] freq = new int[128];
        int len = s.length();

        while (l < len) {
            if (r + 1 < len && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)] = 1;
            } else {
                result = Math.max(result, r - l + 1);
                if (r == len - 1) return result;
                freq[s.charAt(l)] = 0;
                l++;
            }
        }
        return result;
    }
}
