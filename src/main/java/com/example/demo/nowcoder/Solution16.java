package com.example.demo.nowcoder;

/**
 * @author qp
 * 合并两个排序的链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution16 {
    public static void main(String[] args) {

    }
    class ListNode {
        int val;
        ListNode next;
        public ListNode (int val) {
            this.val=val;
        }
    }

    /**
     * 非递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null) {
            return list2;
        }
        if (list2==null) {
            return list1;
        }
        ListNode res=new ListNode(0);
        res.next=null;
        ListNode root=res;
        while (list1!=null && list2!=null) {
            if (list1.val<=list2.val) {
                res.next=list1;
                res=list1;
                list1=list1.next;
            }else {
                res.next=list2;
                res=list2;
                list2=list2.next;
            }
        }
        if (list1==null) {
            res.next=list2;
        }
        if (list2==null) {
            res.next=list1;
        }
        return root.next;
    }

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if (list1==null) {
            return list2;
        }
        if (list2==null) {
            return list1;
        }
        if (list1.val<list2.val) {
            list1.next=Merge2(list1.next,list2);
            return list1;
        }else {
            list2.next=Merge2(list1,list2.next);
            return list2;
        }
    }
}
