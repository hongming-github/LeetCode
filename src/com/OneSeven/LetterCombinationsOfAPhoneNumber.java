package com.OneSeven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhm on 2020/10/12.
 */
public class LetterCombinationsOfAPhoneNumber {
    private static final String[] letterMap = {
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            findCombination(digits, 0, "");
        return result;
    }

    private void findCombination(String digits, int index, String s) {
        if (index == digits.length()) {
            result.add(s);
            return;
        }

        char c = digits.charAt(index);

        String letters = letterMap[c - '2'];

        for (int i = 0; i < letters.length(); i++)
            findCombination(digits, index + 1, s + letters.charAt(i));
    }
}
