package com.TwoZeroThree;

/**
 * Created by zhm on 2018/11/20.
 */
public class RemoveLinkedListElements {
    public ListNode removeElementsWithoutDummyHead(ListNode head, int val) {
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public ListNode removeElementsWithDummyHead(ListNode head, int val) {
        if (head != null) {
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
            ListNode previousNode = dummyHead;
            while (previousNode.next != null) {
                if (previousNode.next.val == val) {
                    removeNode(previousNode, val);
                } else {
                    previousNode = previousNode.next;
                }
            }
            return dummyHead.next;
        }
        return head;
    }

    private void removeNode(ListNode node, int val) {
        ListNode delNode = node.next;
        node.next = delNode.next;
        delNode.next = null;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
