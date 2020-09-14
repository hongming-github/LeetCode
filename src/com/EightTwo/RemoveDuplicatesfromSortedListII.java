package com.EightTwo;

/**
 * Created by zhm on 2020/9/14.
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummyHead = new ListNode(head.val == 0 ? 1 : 0);
        dummyHead.next = head;
        ListNode cur = head;
        ListNode tail = head;
        ListNode pre = dummyHead;

        while (cur.next != null) {
            int value = cur.val;
            ListNode next = cur.next;
            //如果下一个值和当前值相等
            if (next.val == value) {
                //如果前一个值和当前值不相等，tail指向前一个unique值
                if (pre.val != value) {
                    tail = pre;
                }
                pre = cur;
                cur = next;
                //如果下下一个是空值，说明下一个值是最后一个Node，tail指向null
                if (next.next == null)
                    tail.next = null;
            } else {//如果下一个值和当前值不相等
                //如果前一个值和当前值相等,说明找到了最后有相同值的最后一个node,tail直接指向下一个node
                if (pre.val == value) {
                    tail.next = next;
                    cur = next;
                    pre = tail;
                } else {//否则所有指针后移动
                    tail = tail.next;
                    pre = cur;
                    cur = next;
                }
            }
        }
        return dummyHead.next;
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
