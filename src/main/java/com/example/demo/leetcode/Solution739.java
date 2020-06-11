package com.example.demo.leetcode;

import java.util.Stack;

/**
 * @author qp
 * 每日温度
 * 根据每日 气温 列表，请重新生成一个列表，
 * 对应位置的输出是需要再等待多久温度才会升高超过该日的天数。
 * 如果之后都不会升高，请在该位置用 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
 * 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 维护一个单调栈
 */
public class Solution739 {
    public static void main(String[] args) {

    }
    public int[] dailyTemperatures(int[] T) {
        int[] res=new int[T.length];
        int i=0;
        int j=1;
        for ( i=0;i<T.length;i++) {
            for (j=i+1;j<T.length;j++) {
                if (T[i]<T[j]) {
                    res[i]=j-i;
                    break;
                }
            }
        }
        return res;
    }
    public int[] dailyTemperatures2(int[] T) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[T.length];
        for (int i=0;i<T.length;i++) {
            while (!stack.empty() && T[stack.peek()]<T[i]) {
                int index=stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
        return res;

    }

}
