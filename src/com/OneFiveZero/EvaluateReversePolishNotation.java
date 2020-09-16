package com.OneFiveZero;

import java.util.Stack;

/**
 * Created by zhm on 2020/9/16.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s)) {
                stack.push((stack.pop() + stack.pop()));
            } else if ("-".equals(s)) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a - b);
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.isEmpty() ? 0 : stack.pop();
    }
}
