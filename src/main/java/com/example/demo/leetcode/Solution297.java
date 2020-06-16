package com.example.demo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qp
 * 二叉树的序列化和烦序列化
 * 你可以将以下二叉树：
 * 1
  / \
 2   3
 /   \
4     5
序列化为 "[1,2,3,null,null,4,5]"
 迭代
 */
public class Solution297 {
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
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        if (root==null) {
            sb.append("null,");
            return sb.toString() ;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode res=queue.poll();
            if (res==null) {
                sb.append("null,");
            }else {
                sb.append(String.valueOf(res.val)+',');
                queue.add(res.left);
                queue.add(res.right);
            }

        }
        return  sb.toString();
    }

    public TreeNode deserialize(String data) {
           String[] tem=data.split(",");
         /*
         * 记录父节点
         */
        LinkedList<TreeNode> parents=new LinkedList<>();
        TreeNode root=getNode(tem[0]);
        TreeNode parent=root;
        Boolean ifleft=true;
        for (int i=1; i<tem.length;i++) {
            TreeNode cur=getNode(tem[i]);
            if (ifleft) {
                parent.left=cur;
            }else {
                parent.right=cur;
            }
            if (cur!=null) {
                parents.add(cur);
            }
            ifleft=!ifleft;
            if (ifleft) {
                parent=parents.poll();
            }
        }
        return root;

    }

    private TreeNode getNode(String s) {
        if ("null".equals(s)) {
            return null;
        }
        return new TreeNode(Integer.valueOf(s));
    }
}
