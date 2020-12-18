package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class UglyNumberTest {

  @Test
  void test() {

    var uglyNumber = new UglyNumber();

    assertThat(uglyNumber.isUgly(6)).isTrue();
    assertThat(uglyNumber.isUgly(8)).isTrue();
    assertThat(uglyNumber.isUgly(14)).isFalse();
  }
}