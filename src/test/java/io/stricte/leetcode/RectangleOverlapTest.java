package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class RectangleOverlapTest {

  @Test
  void test() {

    var overlap = new RectangleOverlap();
    assertThat(overlap.isRectangleOverlap(new int[]{-1, 0, 1, 1}, new int[]{0, -1, 0, 1}))
      .isTrue();
    assertThat(overlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}))
      .isTrue();
    assertThat(overlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}))
      .isFalse();
    assertThat(overlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3}))
      .isFalse();
    assertThat(overlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{-2, -2, 3, 3}))
      .isTrue();
    assertThat(overlap.isRectangleOverlap(new int[]{-2, -2, 3, 3}, new int[]{0, 0, 1, 1}))
      .isTrue();
  }
}