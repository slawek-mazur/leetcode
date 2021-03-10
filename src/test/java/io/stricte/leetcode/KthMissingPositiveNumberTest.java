package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class KthMissingPositiveNumberTest {

  @Test
  void test() {

    var number = new KthMissingPositiveNumber();
    assertThat(number.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)).isEqualTo(9);
    assertThat(number.findKthPositive(new int[]{1, 2, 3, 4}, 2)).isEqualTo(6);
  }
}