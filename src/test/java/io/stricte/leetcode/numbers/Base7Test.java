package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Base7Test {

  @Test
  void test() {

    var base7 = new Base7();
    assertThat(base7.convertToBase7(0)).isEqualTo("0");
    assertThat(base7.convertToBase7(5)).isEqualTo("5");
    assertThat(base7.convertToBase7(7)).isEqualTo("10");
    assertThat(base7.convertToBase7(8)).isEqualTo("11");
    assertThat(base7.convertToBase7(14)).isEqualTo("20");
    assertThat(base7.convertToBase7(15)).isEqualTo("21");
    assertThat(base7.convertToBase7(100)).isEqualTo("202");
    assertThat(base7.convertToBase7(-7)).isEqualTo("-10");
    assertThat(base7.convertToBase7(-8)).isEqualTo("-11");
  }
}