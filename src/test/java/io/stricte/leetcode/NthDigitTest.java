package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class NthDigitTest {

  @Test
  void test() {

    NthDigit digit = new NthDigit();
    assertThat(digit.findNthDigit(3)).isEqualTo(3);
    //assertThat(digit.findNthDigit(3)).isEqualTo(3);
    //assertThat(digit.findNthDigit(11)).isEqualTo(0);
  }
}