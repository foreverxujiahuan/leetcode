package com.leetcode.q21;

public class Main {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
        ListNode l1 = null;
        ListNode l2 = null;
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
        ListNode res = mergeTwoLists(l1, l2);
        while (res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = new ListNode(0);
        pre.next= cur;
        while (l1!=null && l2!=null) {
            if (l1.val > l2.val) {
                cur.next = new ListNode(l2.val);
                cur = cur.next;
                l2 = l2.next;
            } else {
                cur.next = new ListNode(l1.val);
                cur = cur.next;
                l1 = l1.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return pre.next.next;
    }
}
