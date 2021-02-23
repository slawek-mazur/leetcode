package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInStringTest {

  @Test
  void test() {

    var character = new FirstUniqueCharacterInString();
    assertThat(character.firstUniqChar("leetcode")).isEqualTo(0);
    assertThat(character.firstUniqChar("loveleetcode")).isEqualTo(2);
  }
}