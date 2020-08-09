package com.OneOneZeroEight;

/**
 * Created by zhm on 2020/8/10.
 */
public class DefangIPaddr {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            sb.append(address.charAt(i) == '.' ? "[.]" : address.charAt(i));
        }
        return sb.toString();
    }
}
