package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class LargestNumberAtLeastTwiceOthersTest {

  @Test
  void test() {

    var number = new LargestNumberAtLeastTwiceOthers();

    assertThat(number.dominantIndex(new int[]{70, 30, 10, 5})).isEqualTo(0);
    assertThat(number.dominantIndex(new int[]{3, 6, 1, 0})).isEqualTo(1);
    assertThat(number.dominantIndex(new int[]{1, 2, 3, 4})).isEqualTo(-1);
  }
}