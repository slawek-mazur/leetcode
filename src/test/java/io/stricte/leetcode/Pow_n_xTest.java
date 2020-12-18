package io.stricte.leetcode;

import org.junit.jupiter.api.Test;

class Pow_n_xTest {

  @Test
  void test() {

    Pow_n_x pow = new Pow_n_x();

    for (int i = 0; i < 12; i++) {
      System.out.println(String.format("%d^%d=%.4f", 2, i, pow.myPow(2, i)));
    }
    /*
    assertThat(pow.myPow(2, 10)).isEqualTo(1024.0);
    assertThat(pow.myPow(2.00000, 3)).isEqualTo(8);
    assertThat(pow.myPow(2.00000, 4)).isEqualTo(16);
    assertThat(pow.myPow(2.00000, -2147483648)).isCloseTo(0.0, withPercentage(0.1));
    assertThat(pow.myPow(2.1, 3)).isCloseTo(9.261, withPercentage(0.1));
    assertThat(pow.myPow(2, -2)).isEqualTo(.25);
    */
  }
}