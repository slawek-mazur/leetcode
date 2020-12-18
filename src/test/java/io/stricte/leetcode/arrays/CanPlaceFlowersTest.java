package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {

  @Test
  void test() {

    var flowers = new CanPlaceFlowers();
    assertThat(flowers.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 3)).isTrue();
    assertThat(flowers.canPlaceFlowers(new int[]{0, 0}, 1)).isTrue();
    assertThat(flowers.canPlaceFlowers(new int[]{0, 0}, 2)).isFalse();
    assertThat(flowers.canPlaceFlowers(new int[]{0, 0, 0}, 1)).isTrue();
    assertThat(flowers.canPlaceFlowers(new int[]{0, 1, 0}, 1)).isFalse();
    assertThat(flowers.canPlaceFlowers(new int[]{0, 0, 0}, 2)).isTrue();
    assertThat(flowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
    assertThat(flowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
  }
}