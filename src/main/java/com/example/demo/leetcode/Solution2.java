package com.example.demo.leetcode;


/**
 * @author qp
 * 两数相加
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
   输出：7 -> 0 -> 8
   原因：342 + 465 = 807
 */
public class Solution2 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode res=new ListNode(0);
         ListNode tem=res;
         ListNode p1=l1;
         ListNode p2=l2;
         int sum=0;
         while (p1!=null || p2!=null) {
             if (p1!=null) {
                 sum+=p1.val;
                 p1=p1.next;
             }
             if (p2!=null) {
                 sum+=p2.val;
                 p2=p2.next;
             }
             res.next=new ListNode(sum%10);
             sum/=10;
             res=res.next;

           }
          if (sum==1) {
             res.next=new ListNode(1);
          }

         return tem.next;
    }
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int value) {
            this.val=value;
        }
    }
}
