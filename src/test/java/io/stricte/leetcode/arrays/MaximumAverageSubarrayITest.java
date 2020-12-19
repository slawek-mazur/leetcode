package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaximumAverageSubarrayITest {

  @Test
  void test() {

    var subarrayI = new MaximumAverageSubarrayI();

    assertThat(subarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4))
      .isEqualTo(12.75);
  }
}