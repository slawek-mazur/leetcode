package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

  @Test
  void test() {

    var ones = new MaxConsecutiveOnes();
    assertThat(ones.findMaxConsecutiveOnes(new int[]{0, 0, 0, 0, 0, 0, 0})).isEqualTo(0);
    assertThat(ones.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})).isEqualTo(3);
    assertThat(ones.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 0, 0})).isEqualTo(2);
    assertThat(ones.findMaxConsecutiveOnes(new int[]{0, 1, 0, 1, 1, 1})).isEqualTo(3);
  }
}