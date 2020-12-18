package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

  @Test
  void test() {

    var characters = new LongestSubstringWithoutRepeatingCharacters();
    assertThat(characters.lengthOfLongestSubstring(null)).isEqualTo(0);
    assertThat(characters.lengthOfLongestSubstring("")).isEqualTo(0);
    assertThat(characters.lengthOfLongestSubstring("abcabcbb"))
      .isEqualTo(3);
    assertThat(characters.lengthOfLongestSubstring("bbbbb"))
      .isEqualTo(1);
    assertThat(characters.lengthOfLongestSubstring("pwwkew"))
      .isEqualTo(3);
  }
}