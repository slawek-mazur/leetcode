package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

  @Test
  void test() {

    ValidParentheses parentheses = new ValidParentheses();

    assertThat(parentheses.isValid("{[]}")).isTrue();

    assertThat(parentheses.isValid("([)]")).isFalse();
    assertThat(parentheses.isValid("[]")).isTrue();
    assertThat(parentheses.isValid("()[]{}")).isTrue();
    assertThat(parentheses.isValid("(]")).isFalse();
  }
}