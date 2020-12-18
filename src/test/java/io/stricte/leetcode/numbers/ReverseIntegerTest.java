package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

  @Test
  void test() {

    var integer = new ReverseInteger();
    assertThat(integer.reverse(7)).isEqualTo(7);
    assertThat(integer.reverse(10)).isEqualTo(1);
    assertThat(integer.reverse(123)).isEqualTo(321);
    assertThat(integer.reverse(-123)).isEqualTo(-321);
    assertThat(integer.reverse(120)).isEqualTo(21);
    assertThat(integer.reverse(0)).isEqualTo(0);
  }
}