package com.example.demo.nowcoder;


/**
 * @author qp
 * 矩阵覆盖
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 * 递归求解 当target=1 是 1 target=2 2
 * target=3 3 target>2
 * f(n)=f(n-1)+f(n-2)
 */
public class Solution10 {
    public static void main(String[] args) {
        System.out.println(RectCover(4));
    }

    public static int RectCover(int target) {
       // target=1 1 target=2
        if (target<1) {
            return 0;
        }else if (target<=2) {
            return target;
        }else {
            return RectCover(target-1)+RectCover(target-2);
        }

    }
}
