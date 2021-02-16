package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysIITest {

  @Test
  void test() {

    var ii = new IntersectionOfTwoArraysII();
    assertThat(ii.intersect(new int[0], new int[]{2, 2})).isEmpty();
    assertThat(ii.intersect(new int[]{2, 2}, new int[0])).isEmpty();
    assertThat(ii.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
      .containsExactlyInAnyOrder(2, 2);
    assertThat(ii.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
      .containsExactlyInAnyOrder(4, 9);
  }
}