package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

  @Test
  void test() {

    var number = new SingleNumber();
    assertThat(number.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    assertThat(number.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    assertThat(number.singleNumber(new int[]{1})).isEqualTo(1);
  }
}