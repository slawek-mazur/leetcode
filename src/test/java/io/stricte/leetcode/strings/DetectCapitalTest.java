package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class DetectCapitalTest {

  @Test
  void test() {

    var capital = new DetectCapital();
    assertThat(capital.detectCapitalUse("USA")).isTrue();
    assertThat(capital.detectCapitalUse("leetcode")).isTrue();
    assertThat(capital.detectCapitalUse("Google")).isTrue();
    assertThat(capital.detectCapitalUse("FlaG")).isFalse();
    assertThat(capital.detectCapitalUse("FFFFFFFFFFFFFFFFFFFFf")).isFalse();
  }
}