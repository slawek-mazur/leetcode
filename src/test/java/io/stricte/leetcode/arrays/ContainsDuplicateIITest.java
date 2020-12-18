package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {

  @Test
  void test() {

    ContainsDuplicateII ii = new ContainsDuplicateII();

    assertThat(ii.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}, 3)).isTrue();
    assertThat(ii.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
    assertThat(ii.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)).isTrue();
    assertThat(ii.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
  }
}