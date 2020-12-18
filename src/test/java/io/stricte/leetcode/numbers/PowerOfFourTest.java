package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class PowerOfFourTest {

  @Test
  void test() {

    var power = new PowerOfFour();

    /*
    for (int i = 0; i < 20; i++) {
      int pow = (int) Math.pow(4, i);
      System.out.println(String.format("4^%d=%d (%s)", i, pow, Integer.toBinaryString(pow)));
    }
    */
    System.out.println(Integer.toBinaryString(Byte.MAX_VALUE));

    assertThat(power.isPowerOfFour(-2147483648)).isFalse();
    assertThat(power.isPowerOfFour(4)).isTrue();
    assertThat(power.isPowerOfFour(5)).isFalse();
    assertThat(power.isPowerOfFour(16)).isTrue();
  }
}