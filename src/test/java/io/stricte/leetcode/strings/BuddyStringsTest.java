package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class BuddyStringsTest {

  @Test
  void test() {

    var strings = new BuddyStrings();
    assertThat(strings.buddyStrings("ab", "ba")).isTrue();
    assertThat(strings.buddyStrings("ab", "ab")).isFalse();
    assertThat(strings.buddyStrings("aa", "aa")).isTrue();
    assertThat(strings.buddyStrings("aaaaaaabc", "aaaaaaacb")).isTrue();
    assertThat(strings.buddyStrings("", "aa")).isFalse();
  }
}