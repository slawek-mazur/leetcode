package io.stricte.leetcode;

import org.junit.jupiter.api.Test;

class GenerateParenthesesTest {

  @Test
  void test() {
    GenerateParentheses parentheses = new GenerateParentheses();

    System.out.println(parentheses.generateParenthesis(-1));
    System.out.println(parentheses.generateParenthesis(3));
  }
}