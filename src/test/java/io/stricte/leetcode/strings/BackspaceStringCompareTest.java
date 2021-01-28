package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class BackspaceStringCompareTest {

  @Test
  void test() {

    var backspace = new BackspaceStringCompare();
    assertThat(backspace.backspaceCompare("a##c", "#a#c")).isTrue();
    assertThat(backspace.backspaceCompare("ab##", "c#d#")).isTrue();
    assertThat(backspace.backspaceCompare("a#c", "c")).isTrue();
    assertThat(backspace.backspaceCompare("ab#c", "ad#c")).isTrue();
    assertThat(backspace.backspaceCompare("a#c", "b")).isFalse();
  }
}