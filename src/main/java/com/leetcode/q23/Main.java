package com.leetcode.q23;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] lists = {null};
        ListNode res = mergeKLists(lists);
        while (res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode pre = new ListNode(0);
        ListNode cur = new ListNode(0);
        pre.next = cur;
        boolean flag = true;
        while (flag) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            flag = false;
            for (int i=0;i<lists.length;i++) {
                if (lists[i] != null) {
                    flag = true;
                }
                if (lists[i] != null && lists[i].val < min) {
                    index = i;
                    min = lists[i].val;
                }
            }
            if (index != -1) {
                lists[index] = lists[index].next;
                cur.next = new ListNode(min);
                cur = cur.next;
            }
        }
        return pre.next.next;
    }
}
