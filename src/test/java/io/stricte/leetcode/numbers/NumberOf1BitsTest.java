package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class NumberOf1BitsTest {

  @Test
  void test() {

    var numberOf1Bits = new NumberOf1Bits();
    assertThat(numberOf1Bits.hammingWeight(0b1011)).isEqualTo(3);
    assertThat(numberOf1Bits.hammingWeight(0b10000000)).isEqualTo(1);
    assertThat(numberOf1Bits.hammingWeight(0b11111111111111111111111111111101)).isEqualTo(31);
  }
}