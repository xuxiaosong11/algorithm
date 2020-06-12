package com.example.demo.nowcoder;

/**
 * @author qp
 * 二进制中1的个数
 * 输入一个整数
 * 输出该数二进制表示中1的个数。
 * 其中负数用补码表示。3 11 2
 * 4 100 1
 * n=n&(n-1) 操作会把最右边的1变成0例如
 * 100 & 011 000 就把1变成0了
 */
public class Solution11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(3));
    }
    public static int NumberOf1(int n) {
        int res=0;
        while (n!=0) {
                ++res;
                n=n&(n-1);
            }
        return res;
        }

}

