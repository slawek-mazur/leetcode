package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {

  @Test
  void test() {

    var sum = new RunningSumOf1dArray();
    assertThat(sum.runningSum(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
    assertThat(sum.runningSum(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    assertThat(sum.runningSum(new int[]{3, 1, 2, 10, 1})).isEqualTo(new int[]{3, 4, 6, 16, 17});
  }
}