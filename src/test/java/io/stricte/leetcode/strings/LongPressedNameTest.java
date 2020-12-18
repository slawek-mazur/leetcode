package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class LongPressedNameTest {

  @Test
  void test() {

    var name = new LongPressedName();
    assertThat(name.isLongPressedName("a", "b")).isFalse();
    assertThat(name.isLongPressedName("alex", "aaleex")).isTrue();
    assertThat(name.isLongPressedName("alex", "aaleex")).isTrue();
    assertThat(name.isLongPressedName("saeed", "ssaaedd")).isFalse();
    assertThat(name.isLongPressedName("leelee", "lleeelee")).isTrue();
    assertThat(name.isLongPressedName("laiden", "laiden")).isTrue();
  }
}