package com.EightZeroFour;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by zhm on 2018/11/28.
 */
public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};


        Set<String> set = new TreeSet<>();
        for (String word : words) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                result.append(codes[word.charAt(i) - 'a']);
            }
            set.add(result.toString());
        }

        return set.size();
    }
}
