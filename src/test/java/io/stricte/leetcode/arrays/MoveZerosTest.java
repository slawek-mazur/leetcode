package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

  @Test
  void test() {

    MoveZeros zeros = new MoveZeros();

    int[] nums = {0, 1, 0, 3, 12};
    zeros.moveZeroes(nums);
    assertThat(nums).containsExactly(1, 3, 12, 0, 0);
  }
}