package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ImplementStrStrTest {

  @Test
  void test() {

    var str = new ImplementStrStr();
    assertThat(str.strStr("aaa", "aaaa")).isEqualTo(-1);
    assertThat(str.strStr("", "")).isEqualTo(0);
    assertThat(str.strStr("", null)).isEqualTo(0);
    assertThat(str.strStr(null, "abc")).isEqualTo(-1);
    assertThat(str.strStr("", "abc")).isEqualTo(-1);
    assertThat(str.strStr("hello", "ll")).isEqualTo(2);
    assertThat(str.strStr("aaaaa", "bba")).isEqualTo(-1);
  }
}