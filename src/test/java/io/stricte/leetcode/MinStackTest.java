package io.stricte.leetcode;

import org.junit.jupiter.api.Test;

class MinStackTest {

  @Test
  void test() {

    var stack = new MinStack();

    stack.push(-2);
    stack.push(0);
    stack.push(-3);
    int min1 = stack.getMin();
    stack.pop();
    int top = stack.top();
    int min2 = stack.getMin();
  }
}