package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class TargetSumTest {

  @Test
  void test() {

    TargetSum sum = new TargetSum();

    assertThat(sum.findTargetSumWays(new int[]{1, 0}, 1)).isEqualTo(2);
    assertThat(sum.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
  }
}