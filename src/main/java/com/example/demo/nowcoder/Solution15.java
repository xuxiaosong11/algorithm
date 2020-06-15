package com.example.demo.nowcoder;

import java.util.Stack;

/**
 * @author qp
 * 反转链表
 * 输入一个链表，反转链表后，
 * 输出新链表的表头
 */
public class Solution15 {
    public static void main(String[] args) {

    }
    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val=val;
        }
    }
    public ListNode ReverseList(ListNode head) {
       if (head==null) {
           return null;
       }
       ListNode pre=null;
       ListNode tem=head;
       while (tem!=null) {
           ListNode cur=tem.next;
           tem.next=pre;
           pre=tem;
           tem=cur;
       }
       return pre;
    }
}
