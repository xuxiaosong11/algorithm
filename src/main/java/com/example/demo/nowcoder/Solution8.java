package com.example.demo.nowcoder;

/**
 * @author qp
 * 跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 * 变向斐波那契数列
 */
public class Solution8 {
    public static void main(String[] args) {
        int i = JumpFloor(5);
        System.out.println(i);
    }
    public  static  int JumpFloor(int target) {
        if (target<=0) {
            return 0;
        }
        if (target<3) {
            return target;
        }
        int f1=1;
        int f2=2;
        int res=0;
        for (int i=3;i<=target;i++) {
            res=f1+f2;
            f1=f2;
            f2=res;
        }

        return res;

    }
}
