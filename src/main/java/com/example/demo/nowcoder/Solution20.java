package com.example.demo.nowcoder;

import java.util.Stack;

/**
 * @author qp
 * 最小栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
   注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
   3 4 5
 */
public class Solution20 {
    public static void main(String[] args) {

    }
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public void push(int node) {
       stack.push(node);
       if (minStack.empty() || minStack.peek()>node) {
           minStack.push(node);
       }
    }

    public void pop() {
      int tem=stack.pop();
      if (!minStack.empty()) {
          if(tem==minStack.peek()) {
              minStack.pop();
          }
      }
     }

    public int top() {
     return stack.peek();
    }

    public int min() {
      return minStack.peek();
    }



}
