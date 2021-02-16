package io.stricte.leetcode;

import org.junit.jupiter.api.Test;

class MyQueueTest {

  @Test
  void test() {

    var q = new MyQueue();
    q.push(1);
    q.push(2);
    q.push(3);
    int peek1 = q.peek();
    int peek2 = q.peek();
    q.pop();
    q.pop();
    int peek3 = q.peek();
    System.out.println();
  }
}