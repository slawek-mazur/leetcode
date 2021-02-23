package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SingleNumberIITest {

  @Test
  void test() {

    var ii = new SingleNumberII();
    assertThat(ii.singleNumber(new int[]{2, 2, 3, 2})).isEqualTo(3);
    assertThat(ii.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99})).isEqualTo(99);
  }
}