package com.example.demo.nowcoder;

/**
 * @author qp
 * 变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * f(n)=2*f(n-1)
 */
public class Solution9 {
    public static void main(String[] args) {

    }
    public int JumpFloorII(int target) {
        if (target<=0) {
            return -1;
        }else if (target==1) {
            return 1;
        }else {
            return JumpFloorII(target-1);
        }
    }
}

