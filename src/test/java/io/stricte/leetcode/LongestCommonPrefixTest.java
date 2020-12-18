package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

  @Test
  void test() {

    var prefix = new LongestCommonPrefix();

    assertThat(prefix.longestCommonPrefix(new String[]{"flower", "", "flight"})).isEqualTo("");
    assertThat(prefix.longestCommonPrefix(new String[]{"flower", "flow", null})).isEqualTo("");
    assertThat(prefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
    assertThat(prefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
    assertThat(prefix.longestCommonPrefix(new String[]{"a", "aa", "aaa"})).isEqualTo("a");
  }
}