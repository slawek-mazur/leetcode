package io.stricte.leetcode;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/
/*

 */
public class MyQueue {

  private final Stack<Integer> input = new Stack<>();
  private final Stack<Integer> output = new Stack<>();

  public void push(int x) {
    input.push(x);
  }

  public void pop() {
    peek();
    output.pop();
  }

  public int peek() {
    if (output.empty()) {
      while (!input.empty()) {
        output.push(input.pop());
      }
    }
    return output.peek();
  }

  public boolean empty() {
    return input.empty() && output.empty();
  }
}
