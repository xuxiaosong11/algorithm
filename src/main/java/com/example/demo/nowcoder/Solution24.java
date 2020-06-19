package com.example.demo.nowcoder;


import java.util.ArrayList;

/**
 * @author qp
 * 二叉树中和为某一值的路径
 * dfs 回溯
 */
public class Solution24 {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
                   dfs(root,target,0,new ArrayList<Integer>());
                   return res;
    }
    private void dfs(TreeNode root, int target, int i, ArrayList<Integer> list) {
        if (root==null) {
            return;
        }
        list.add(root.val);
        if (target==i+root.val && root.left==null && root.right==null) {
            res.add(new ArrayList<>(list));
        }
        dfs(root.left,target,i+root.val,list);
        dfs(root.right,target,i+root.val,list);
        list.remove(list.size()-1);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val=val;
        }
    }

}
