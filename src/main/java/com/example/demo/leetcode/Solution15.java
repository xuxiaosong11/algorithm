package com.example.demo.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qp
 * 三数之和
 * 给你一个包含 n 个整数的数组 nums，
 * 判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]
   满足要求的三元组集合为：
  [
   [-1, 0, 1],
   [-1, -1, 2]
  ]
  思路 排序+二分
 */
public class Solution15 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int length=nums.length;
        if (length<3) {
            return  res;
        }
        Arrays.sort(nums);
        for (int i=0;i<length-2;i++) {
            /*
              已经排好序了
             */
            if (nums[i]>0) {
                break;
            }
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int l=i+1;
            int r=length-1;
            while (l<r) {
                if (nums[i]+nums[l]+nums[r]>0) {
                    r--;
                }else if (nums[i]+nums[l]+nums[r]<0) {
                    l++;
                }else {
                    List<Integer> tem=new ArrayList<>();
                    tem.add(nums[i]);
                    tem.add(nums[l]);
                    tem.add(nums[r]);
                    res.add(tem);
                    l++;
                    r--;
                    while (l<r && nums[l]==nums[l-1]) {
                        /*
                          去重
                         */
                        continue;
                    }
                    while (l<r && r!=length-1 && nums[r]==nums[r-1]) {
                        continue;
                    }
                }
            }
        }
         return res;
    }
}
