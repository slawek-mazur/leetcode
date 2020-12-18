package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaximumProductSubarrayTest {

  @Test
  void test() {
    MaximumProductSubarray subarray = new MaximumProductSubarray();

    assertThat(subarray.maxProduct(new int[]{2, 3, -99, 9, 110})).isEqualTo(990);
    assertThat(subarray.maxProduct(new int[]{2, 3, -4, 2})).isEqualTo(6);
    assertThat(subarray.maxProduct(new int[]{-2, 0, -1})).isEqualTo(0);
  }
}