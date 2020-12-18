package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class NumberOfSegmentsInStringTest {

  @Test
  void test() {

    var number = new NumberOfSegmentsInString();
    assertThat(number.countSegments(null)).isEqualTo(0);
    assertThat(number.countSegments("")).isEqualTo(0);
    assertThat(number.countSegments("    foo    bar")).isEqualTo(2);
    assertThat(number.countSegments("Of all the gin joints in all the towns in all the world,   ")).isEqualTo(13);
    assertThat(number.countSegments("Hello, my name is John")).isEqualTo(5);
    assertThat(number.countSegments("Hello")).isEqualTo(1);
    assertThat(number.countSegments("love live! mu'sic forever")).isEqualTo(4);
  }
}