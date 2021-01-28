package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaximumProductThreeNumbersTest {

  @Test
  void test() {

    var numbers = new MaximumProductThreeNumbers();
    assertThat(numbers.maximumProduct(new int[]{-5, -2, 3, 10})).isEqualTo(100);
    assertThat(numbers.maximumProduct(new int[]{5, 2, 3, 10})).isEqualTo(150);
    assertThat(numbers.maximumProduct(new int[]{1, 2, 3})).isEqualTo(6);
    assertThat(numbers.maximumProduct(new int[]{-1, -2, -3})).isEqualTo(-6);
    assertThat(numbers.maximumProduct(new int[]{1, 2, 3, 4})).isEqualTo(24);
  }
}