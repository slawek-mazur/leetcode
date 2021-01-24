package io.stricte.leetcode;

import java.util.Stack;

// https://leetcode.com/problems/min-stack/
/*

 */
public class MinStack {

  private final Stack<Integer> stack = new Stack<>();

  private Integer min;

  /**
   * initialize your data structure here.
   */
  public MinStack() { }

  public void push(int x) {
    if (null == min) {
      min = x;

    } else if (x <= min) {
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public void pop() {
    if (stack.pop().equals(min)) {
      min = stack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }

  @Override
  public String toString() {
    return "[stack]=" + stack + ", [min]=" + min;
  }
}
