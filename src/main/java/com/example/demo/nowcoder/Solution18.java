package com.example.demo.nowcoder;

/**
 * @author qp
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 类似于 交换当前节点然后重复左节点 右节点
 */
public class Solution18 {
    public static void main(String[] args) {

    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (int val) {
            this.val=val;
        }
    }

    public void Mirror(TreeNode root) {
         if (root!=null) {
             TreeNode tem=root.left;
             root.left=root.right;
             root.right=tem;
             Mirror(root.left);
             Mirror(root.right);
         }
    }
}
