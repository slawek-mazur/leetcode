package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {

  @Test
  void test() {

    var strings = new IsomorphicStrings();

    assertThat(strings.isIsomorphic("ab", "11")).isFalse();
    assertThat(strings.isIsomorphic("paper", "title")).isTrue();
    assertThat(strings.isIsomorphic("ab", "aa")).isFalse();
    assertThat(strings.isIsomorphic("egg", "add")).isTrue();
    assertThat(strings.isIsomorphic("foo", "bar")).isFalse();
  }
}