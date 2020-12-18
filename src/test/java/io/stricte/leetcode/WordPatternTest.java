package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class WordPatternTest {

  @Test
  void test() {

    WordPattern pattern = new WordPattern();

    assertThat(pattern.wordPattern("aaa", "aa aa aa aa")).isFalse();
    assertThat(pattern.wordPattern("abba", "dog cat cat dog")).isTrue();
    assertThat(pattern.wordPattern("abba", "dog cat cat fish")).isFalse();
    assertThat(pattern.wordPattern("aaaa", "dog cat cat dog")).isFalse();
    assertThat(pattern.wordPattern("abba", "dog dog dog dog")).isFalse();
  }
}