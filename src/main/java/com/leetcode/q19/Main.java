package com.leetcode.q19;

public class Main {
    public static void main(String[] args) {
        ListNode cur = new ListNode(1);
        cur.next = new ListNode(2);
//        cur.next.next = new ListNode(3);
//        cur.next.next.next = new ListNode(4);
//        cur.next.next.next.next = new ListNode(5);
        int n = 1;
        ListNode res = removeNthFromEnd(cur, n);
        while (res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode headTmp = head;
        while (headTmp!=null) {
            headTmp = headTmp.next;
            length = length+1;
        }
        int indexTarget = length - n + 1;
        ListNode pre = new ListNode(0);
        ListNode cur = new ListNode(0);
        pre.next = cur;
        int index = 1;
        while (head!=null) {
            if (index == indexTarget) {
                head = head.next;
                if (head!=null)
                    cur.next = new ListNode(head.val);
            }else {
                cur.next = new ListNode(head.val);
            }
            cur = cur.next;
            if (head!=null)
            head = head.next;
            index++;
        }
        return pre.next.next;
    }
}
