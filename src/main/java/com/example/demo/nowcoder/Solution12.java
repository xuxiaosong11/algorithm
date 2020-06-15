package com.example.demo.nowcoder;

/**
 * @author qp
 * 数值的整数次方
 * 给定一个double类型的浮点数base
 * 和int类型的整数exponent。
 * 求base的exponent次方。
   保证base和exponent不同时为0
   2 3 8     2 -3  1/8
   考虑到exponent为负数的情况
 */
public class Solution12 {
    public static void main(String[] args) {

    }
    public double Power(double base, int exponent) {
          double res=1.0;
        if (exponent<0) {
            for (int i=1;i<=-exponent;i++) {
                res*=base;
            }
        }else if (exponent>0) {
            for (int i=1;i<=exponent;i++) {
                res*=base;
            }
        }else {
            return 1;
        }
        return exponent>0?res:1/res;
    }
}
