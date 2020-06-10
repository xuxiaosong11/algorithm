package com.example.demo.nowcoder;

/**
 * @author qp
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}
 * 和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回
 * 思路  前序遍历第一个数是root节点 中序遍历中pre[o]==in[i] i前面的也是一个
 * 前序和中序遍历 然后递归
 */
public class Solution4 {
    public static void main(String[] args) {

    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode res=help(pre,0,pre.length-1,in,0,in.length-1);
         return res;
    }

    private TreeNode help(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn) {
        if (startPre>endPre || startIn>endIn) {
            return null;
        }
        TreeNode res=new TreeNode(pre[startPre]);
        for (int i=startIn;i<=endIn;i++) {
            if (pre[startPre]==in[i]) {
                res.left=help(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                res.right=help(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return res;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
