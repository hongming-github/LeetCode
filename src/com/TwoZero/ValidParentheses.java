package com.TwoZero;

import java.util.Stack;

/**
 * Created by zhm on 2018/11/15.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if ((s.length() & 1) == 1) return false;
        else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    if (c == ')' && stack.pop() != '(') {
                        return false;
                    }

                    if (c == ']' && stack.pop() != '[') {
                        return false;
                    }

                    if (c == '}' && stack.pop() != '{') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
