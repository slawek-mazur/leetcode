package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

  @Test
  void test() {

    var number = new HappyNumber();
    assertThat(number.isHappy(2)).isFalse();
    assertThat(number.isHappy(1)).isTrue();
    assertThat(number.isHappy(7)).isTrue();
    assertThat(number.isHappy(19)).isTrue();
  }
}