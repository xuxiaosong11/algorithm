package com.example.demo.nowcoder;

import java.util.Stack;

/**
 * @author qp
 * 输出链表的倒数第N个节点
 */
public class Solution14 {

    public static void main(String[] args) {

    }
    class ListNode {
        int val;
        ListNode next;
        public ListNode (int val) {
            this.val=val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
              Stack<Integer> stack=new Stack<>();
              ListNode  tem=head;
              while (tem!=null) {
                  stack.push(tem.val);
                  tem=tem.next;
              }
              for (int i=0;i<k;i++) {
                  stack.pop();
              }
              return new ListNode(stack.pop());
    }
}
