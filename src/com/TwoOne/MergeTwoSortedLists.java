package com.TwoOne;

/**
 * Created by zhm on 2020/8/2.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp.next = l2;
                l2 = null;
            } else if (l2 == null) {
                temp.next = l1;
                l1 = null;
            } else if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        return result.next;

        /*
        **  Recursion solution
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
        */
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
