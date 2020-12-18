package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SummaryRangesTest {

  @Test
  void test() {

    var ranges = new SummaryRanges();

    assertThat(ranges.summaryRanges(new int[]{0, 1, 2, 5, 8, 9, 10}))
      .containsExactly("0->2", "5", "8->10");

    assertThat(ranges.summaryRanges(new int[]{0, 1, 2, 3, 4, 5}))
      .containsExactly("0->5");

    assertThat(ranges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}))
      .containsExactly("0->2", "4->5", "7");
  }
}