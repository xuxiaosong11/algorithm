package com.example.demo.nowcoder;


/**
 * @author qp
 * 调整数组顺序使得奇数在偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * [1,4,2,3,5,6] [1,3,5,4,2,6]
 */
public class Solution13 {
    public static void main(String[] args) {

    }
    public static void reOrderArray(int [] array) {
        int length=array.length;
        /*
          m 记录奇数的位置
         */
        int m=0;
        for (int i=0;i<length;i++) {
            if (array[i]%2==1) {
                int j=i;
                while (j>m) {
                    int tem=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tem;
                    j--;
                }
                m++;
            }
        }
    }
}
