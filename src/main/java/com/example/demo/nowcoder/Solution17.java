package com.example.demo.nowcoder;

/**
 * @author qp
 * 树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 *   1
 *  4  5   4
 * 3      3
 *
 * 以A节点的任何一个节点为根节点和B节点进行比较 如果B为空就返回true
 */
public class Solution17 {
    public static void main(String[] args) {

    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val=val;
        }
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
           if (root1==null || root2==null) {
               return false;
           }
           return help(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);

     }

    private boolean help(TreeNode root1, TreeNode root2) {
        if (root2==null) {
            return true;
        }
        if (root1==null) {
            return false;
        }
        return root1.val==root2.val && help(root1.left,root2.left) && help(root1.right,root2.right);
    }
}
