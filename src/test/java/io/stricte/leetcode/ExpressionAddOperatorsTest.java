package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ExpressionAddOperatorsTest {

  @Test
  void test() {

    var operators = new ExpressionAddOperators();

    assertThat(operators.addOperators("123", 6))
      .containsExactlyInAnyOrder("1+2+3", "1*2*3");
    assertThat(operators.addOperators("232", 8))
      .containsExactlyInAnyOrder("2*3+2", "2+3*2");

    assertThat(operators.addOperators("105", 5))
      .containsExactlyInAnyOrder("1*0+5", "10-5");
    assertThat(operators.addOperators("00", 0))
      .containsExactlyInAnyOrder("0+0", "0-0", "0*0");
    assertThat(operators.addOperators("3456237490", 9191)).isEmpty();
  }
}