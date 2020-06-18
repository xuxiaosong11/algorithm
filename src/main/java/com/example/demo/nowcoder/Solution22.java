package com.example.demo.nowcoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qp
 */
public class Solution22 {
    public static void main(String[] args) {

    }
    public int[] levelOrder(TreeNode root) {
        if (root==null) {
            return new int[0];
        }
        int lenght=getTreeNodeLength(root);
        int[] res=new int[lenght];
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int index=0;
        while (!queue.isEmpty()) {
            TreeNode cur=queue.poll();
            res[index++]=cur.val;
            if (cur.left!=null) {
                queue.add(cur.left);
            }
            if (cur.right!=null) {
                queue.add(cur.right);
            }
        }
        return res;
    }

    private int getTreeNodeLength(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int res=0;
        while(!queue.isEmpty()) {
            TreeNode cur=queue.poll();
            res++;
            if (cur.left!=null) {
                queue.add(cur.left);
            }
            if (cur.right!=null) {
                queue.add(cur.right);
            }
        }
        return res;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (int val) {
            this.val=val;
        }
    }
}
