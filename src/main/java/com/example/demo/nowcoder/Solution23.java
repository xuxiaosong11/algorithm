package com.example.demo.nowcoder;

/**
 * @author qp
 * 二叉搜索树的后序遍历序列
 */
public class Solution23 {
    public static void main(String[] args) {

    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0) {
            return false;
        }
        return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }
    private  boolean  VerifySquenceOfBST(int[] sequence,int start,int end) {
        if (start>=end) {
            return true;
        }
        int root=sequence[end];
        int k=start;
        while (k<end && sequence[k]<root) {
            k++;
        }
        for (int i=k;i<end;i++) {
            if (sequence[i]<root) {
                return false;
            }
        }
        if (!VerifySquenceOfBST(sequence,start,k-1)) {
            return false;
        }
        if (!VerifySquenceOfBST(sequence,k,end-1)) {
            return false;
        }
        return true;
    }
}
