package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class AddStringsTest {

  @Test
  void test() {

    AddStrings strings = new AddStrings();

    assertThat(strings.addStrings("1", "9")).isEqualTo("10");
    assertThat(strings.addStrings("1", "4")).isEqualTo("5");
    assertThat(strings.addStrings("128", "6")).isEqualTo("134");
    assertThat(strings.addStrings("10199", "1")).isEqualTo("10200");
  }
}