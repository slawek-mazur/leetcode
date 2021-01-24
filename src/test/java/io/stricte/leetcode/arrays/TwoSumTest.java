package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void test() {

    var twoSum = new TwoSum();
    assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).containsExactlyInAnyOrder(0, 1);
    assertThat(twoSum.twoSum(new int[]{3, 2, 4}, 6)).containsExactlyInAnyOrder(2, 1);
    assertThat(twoSum.twoSum(new int[]{3, 3}, 6)).containsExactlyInAnyOrder(0, 1);
  }
}