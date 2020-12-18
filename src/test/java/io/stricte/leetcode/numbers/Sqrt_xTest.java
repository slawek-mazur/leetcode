package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Sqrt_xTest {

  @Test
  void test() {

    var sqrt = new Sqrt_x();
    assertThat(sqrt.mySqrt(2147395599)).isEqualTo(46339);
    assertThat(sqrt.mySqrt(3)).isEqualTo(1);
    assertThat(sqrt.mySqrt(4)).isEqualTo(2);
    assertThat(sqrt.mySqrt(5)).isEqualTo(2);
    assertThat(sqrt.mySqrt(6)).isEqualTo(2);
    assertThat(sqrt.mySqrt(7)).isEqualTo(2);
    assertThat(sqrt.mySqrt(8)).isEqualTo(2);
    assertThat(sqrt.mySqrt(9)).isEqualTo(3);
    assertThat(sqrt.mySqrt(10)).isEqualTo(3);
    assertThat(sqrt.mySqrt(11)).isEqualTo(3);
    assertThat(sqrt.mySqrt(12)).isEqualTo(3);
    assertThat(sqrt.mySqrt(13)).isEqualTo(3);
    assertThat(sqrt.mySqrt(14)).isEqualTo(3);
    assertThat(sqrt.mySqrt(15)).isEqualTo(3);
    assertThat(sqrt.mySqrt(16)).isEqualTo(4);
  }
}