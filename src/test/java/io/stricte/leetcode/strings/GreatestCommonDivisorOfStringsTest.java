package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorOfStringsTest {

  @Test
  void test() {

    var divisor = new GreatestCommonDivisorOfStrings();
    assertThat(divisor.gcdOfStrings("ABABAB", "ABAB")).isEqualTo("AB");
    assertThat(divisor.gcdOfStrings("ABCABC", "ABC")).isEqualTo("ABC");
    assertThat(divisor.gcdOfStrings("LEET", "CODE")).isEqualTo("");
    assertThat(divisor.gcdOfStrings("ABCDEF", "ABC")).isEqualTo("");
  }
}