package com.Two;

/**
 * Created by zhm on 2018/11/20.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode currentNode = null;
        boolean plusOne = false;
        boolean first = true;
        while (l1 != null || l2 != null || plusOne == true) {
            int val1 = 0, val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }

            int val = val1 + val2 + (plusOne ? 1 : 0);

            if (val >= 10) {
                val -= 10;
                plusOne = true;
            } else {
                plusOne = false;
            }

            ListNode newNode = new ListNode(val);

            if (first) {
                root = newNode;
                currentNode = root;
                first = false;
            } else {
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
        }

        return root;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
