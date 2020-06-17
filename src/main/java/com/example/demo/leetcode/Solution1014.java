package com.example.demo.leetcode;

/**
 * @author qp
 * 最佳观光组合
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，
 * 并且两个景点 i 和 j 之间的距离为 j - i。
   一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）
   景点的评分之和减去它们两者之间的距离。
   返回一对观光景点能取得的最高分。
    输入：[8,1,5,2,6]
    输出：11
    解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
    dp[i]+i + dp[j]-j 的最大值 每次更新 dp[i]+i 就好了
 */
public class Solution1014 {
    public static void main(String[] args) {

    }
    public int maxScoreSightseeingPair(int[] A) {
       int length=A.length;
       if (length==0) {
           return 0;
       }
       int res=Integer.MIN_VALUE;
       int left=A[0];
       for (int j=1;j<length;j++) {
           res=Math.max(res,left+A[j]-j);
           left=Math.max(left,A[j]+j);
       }
       return res;
    }
}
