package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

  @Test
  void test() {

    var note = new RansomNote();
    assertThat(note.canConstruct("aa", "a")).isFalse();
    assertThat(note.canConstruct("a", "b")).isFalse();
    assertThat(note.canConstruct("aa", "ab")).isFalse();
    assertThat(note.canConstruct("aa", "aab")).isTrue();
  }
}