package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class PerfectNumberTest {

  @Test
  void test() {

    var number = new PerfectNumber();
    assertThat(number.checkPerfectNumber(16)).isFalse();
    /*
    assertThat(number.checkPerfectNumber(2016)).isFalse();
    assertThat(number.checkPerfectNumber(1)).isFalse();
    assertThat(number.checkPerfectNumber(6)).isTrue();
    assertThat(number.checkPerfectNumber(12)).isFalse();
    assertThat(number.checkPerfectNumber(496)).isTrue();
    assertThat(number.checkPerfectNumber(8128)).isTrue();
    */
  }
}