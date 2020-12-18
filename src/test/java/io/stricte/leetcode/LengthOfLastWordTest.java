package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

  @Test
  void test() {

    var word = new LengthOfLastWord();
    assertThat(word.lengthOfLastWord("a")).isEqualTo(1);
    assertThat(word.lengthOfLastWord("a b c ")).isEqualTo(1);
    assertThat(word.lengthOfLastWord("a bc def ghij klmno  ")).isEqualTo(5);
    assertThat(word.lengthOfLastWord("Hello World")).isEqualTo(5);
  }
}