package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class PowerfulIntegersTest {

  @Test
  void test() {

    var integers = new PowerfulIntegers();

    assertThat(integers.powerfulIntegers(2, 1, 10))
      .containsExactlyInAnyOrder(2, 3, 5, 9);

    assertThat(integers.powerfulIntegers(2, 3, 10))
      .containsExactlyInAnyOrder(2, 3, 4, 5, 7, 9, 10);
  }
}