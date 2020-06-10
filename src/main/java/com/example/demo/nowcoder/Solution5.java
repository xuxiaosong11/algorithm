package com.example.demo.nowcoder;


import java.util.Stack;

/**
 * @author qp
 * 用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作 队列中的元素为int类型。
 * 一个栈push 如果一个栈是空的 另一个栈直接pop到空栈里面 最后直接pop()
 */
public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        solution5.push(5);
        solution5.push(55);
        solution5.push(555);
        solution5.push(5555);
        System.out.println(solution5.pop());
    }

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    private void push(int node) {
      stack1.push(node);
    }

   private int pop() {
      if (stack2.empty()) {
          while (!stack1.empty()) {
              stack2.push(stack1.pop());
          }
      }
      return stack2.pop();
    }

}
