package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MakeTheStringGreatTest {

  @Test
  void test() {

    var great = new MakeTheStringGreat();
    assertThat(great.makeGood("NAanorRoOrROwnTNW")).isEqualTo("wnTNW");
    assertThat(great.makeGood("Bb")).isEqualTo("");
    assertThat(great.makeGood("B")).isEqualTo("B");
    assertThat(great.makeGood("mabBAC")).isEqualTo("mC");
    assertThat(great.makeGood("leEeetcode")).isEqualTo("leetcode");
    assertThat(great.makeGood("abBAcC")).isEqualTo("");
  }
}