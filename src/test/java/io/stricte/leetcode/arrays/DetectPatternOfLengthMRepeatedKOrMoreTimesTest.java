package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class DetectPatternOfLengthMRepeatedKOrMoreTimesTest {

  @Test
  void test() {

    var pattern = new DetectPatternOfLengthMRepeatedKOrMoreTimes();

    assertThat(pattern.containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3))
      .isTrue();

    assertThat(pattern.containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2))
      .isTrue();

    assertThat(pattern.containsPattern(new int[]{1, 2, 1, 2, 1, 3}, 2, 3))
      .isFalse();

    assertThat(pattern.containsPattern(new int[]{1, 2, 3, 1, 2}, 2, 2))
      .isFalse();

    assertThat(pattern.containsPattern(new int[]{2, 2, 2, 2}, 2, 3))
      .isFalse();
  }
}