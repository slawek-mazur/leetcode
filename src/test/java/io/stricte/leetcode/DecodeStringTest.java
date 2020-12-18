package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class DecodeStringTest {

  @Test
  void test() {

    DecodeString string = new DecodeString();
    assertThat(string.decodeString("2[ab]")).isEqualTo("abab");
    assertThat(string.decodeString("3[a]2[bc]")).isEqualTo("aaabcbc");
    assertThat(string.decodeString("3[a2[c]]")).isEqualTo("accaccacc");
    assertThat(string.decodeString("2[abc]3[cd]ef")).isEqualTo("abcabccdcdcdef");
    assertThat(string.decodeString("abc3[cd]xyz")).isEqualTo("abccdcdcdxyz");
  }
}