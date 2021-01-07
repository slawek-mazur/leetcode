package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class RepeatedSubstringPatternTest {

  @Test
  void test() {

    var pattern = new RepeatedSubstringPattern();

    assertThat(pattern.repeatedSubstringPattern("aabaaba")).isFalse();
    assertThat(pattern.repeatedSubstringPattern("abcabcabcabc")).isTrue();
    assertThat(pattern.repeatedSubstringPattern("abab")).isTrue();
    assertThat(pattern.repeatedSubstringPattern("abab")).isTrue();
    assertThat(pattern.repeatedSubstringPattern("aba")).isFalse();
  }
}