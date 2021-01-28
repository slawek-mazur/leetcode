package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

  @Test
  void test() {

    var subarray = new MaximumSubarray();
    assertThat(subarray.maxSubArray(new int[]{-10, 1})).isEqualTo(1);
    assertThat(subarray.maxSubArray(new int[]{4, -2, 2, 1})).isEqualTo(5);
    assertThat(subarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    assertThat(subarray.maxSubArray(new int[]{1})).isEqualTo(1);
    assertThat(subarray.maxSubArray(new int[]{0})).isEqualTo(0);
    assertThat(subarray.maxSubArray(new int[]{-1})).isEqualTo(-1);
    assertThat(subarray.maxSubArray(new int[]{-100000})).isEqualTo(-100000);
  }
}