package com.example.demo.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author qp
 * 从尾到头打印链表
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Solution3 {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
           ArrayList<Integer> res=new ArrayList<>();
           Stack<Integer> stack=new Stack<>();
           if (listNode==null) {
               return res;
           }
           ListNode tem=listNode;
           while (tem!=null) {
               stack.push(tem.val);
               tem=tem.next;
           }
           while (!stack.isEmpty()) {
               res.add(stack.pop());
           }
           return res;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
         ArrayList<Integer> res=new ArrayList<>();
         if (listNode==null) {
             return res;
         }
         ListNode tem=listNode;
         while (tem!=null) {
             res.add(0,tem.val);
             tem=tem.next;
          }
         return res;
    }
    class ListNode {
        int val;
        ListNode next;
        public ListNode (int val)  {
            this.val=val;
        }
    }
}


