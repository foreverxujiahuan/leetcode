package com.leetcode.q2;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(l1, l2);
        while (res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        ListNode pre = new ListNode(tmp);
        ListNode res = new ListNode(tmp);
        pre.next = res;
        int t = 0;
        while (l1!=null && l2!=null) {
            int val = l1.val + l2.val;
            res.next = new ListNode((val + t)%10);
            if (val+t>=10) {
                t = 1;
            }else {
                t = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        if (l2!=null) {
            while (l2!=null){
                tmp = (l2.val+t)%10;
                if (l2.val+t>=10) {
                    t = 1;
                }else {
                    t = 0;
                }
                res.next = new ListNode(tmp);
                l2 = l2.next;
                res = res.next;
            }
        }
        if (l1!=null) {
            while (l1!=null){
                tmp = (l1.val+t)%10;
                if (l1.val+t>=10) {
                    t = 1;
                }else {
                    t = 0;
                }
                res.next = new ListNode(tmp);
                l1 = l1.next;
                res = res.next;
            }
        }
        if (t==1){
            res.next = new ListNode(t);
        }
        return pre.next.next;
    }
}
