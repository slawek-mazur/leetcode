package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ValidPerfectSquareTest {

  @Test
  void test() {

    var square = new ValidPerfectSquare();

    assertThat(square.isPerfectSquare(1)).isTrue();
    assertThat(square.isPerfectSquare(4)).isTrue();
    assertThat(square.isPerfectSquare(9)).isTrue();
    assertThat(square.isPerfectSquare(16)).isTrue();
    assertThat(square.isPerfectSquare(14)).isFalse();
  }
}