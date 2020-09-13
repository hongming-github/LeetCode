package com.TwoThreeSeven;


/**
 * Created by zhm on 2020/9/13.
 */
public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        if (node == null) return;
        if (node.next == null) node = null;

        ListNode deleteNode = node.next;
        node.val = deleteNode.val;
        node.next = deleteNode.next;
        deleteNode.next = null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
