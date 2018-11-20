package com.test;

import com.TwoZero.ValidParentheses;

public class Main {

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s1= "({[]})";
        String s2= "({[}})";
        boolean result = v.isValid(s2);
        System.out.println(result);
    }
}
