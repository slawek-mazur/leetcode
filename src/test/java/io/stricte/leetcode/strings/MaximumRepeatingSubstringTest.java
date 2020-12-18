package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaximumRepeatingSubstringTest {

  @Test
  void test() {

    var substring = new MaximumRepeatingSubstring();

    assertThat(substring.maxRepeating("a", "a")).isEqualTo(1);
    assertThat(substring.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba")).isEqualTo(5);
    assertThat(substring.maxRepeating("ababc", "ab")).isEqualTo(2);
    assertThat(substring.maxRepeating("ababc", "ba")).isEqualTo(1);
    assertThat(substring.maxRepeating("ababc", "ac")).isEqualTo(0);
  }
}