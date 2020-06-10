package com.example.demo.nowcoder;

/**
 * @author qp
 * 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）
 * 迭代 保存当前的数和去前一个数的值
 */
public class Solution7 {
    public static void main(String[] args) {
        int i = new Solution7().fiboNacci(6);
        System.out.println(i);
    }
    public int fiboNacci(int n) {
          if (n<2) {
              return n;
          }
          int f1=0;
          int f2=1;
          int res=0;
          for (int i=2;i<=n;i++) {
              res=f1+f2;
              f1=f2;
              f2=res;
          }
          return res;
    }
}
