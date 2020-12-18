package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaximumSwapTest {

  @Test
  void test() {

    MaximumSwap max = new MaximumSwap();
    assertThat(max.maximumSwap(2736)).isEqualTo(7236);
    assertThat(max.maximumSwap(9361)).isEqualTo(9631);
    assertThat(max.maximumSwap(9223)).isEqualTo(9322);
    assertThat(max.maximumSwap(4421)).isEqualTo(4421);
  }
}