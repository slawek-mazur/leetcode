package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIIITest {

  @Test
  void test() {

    ContainsDuplicateIII iii = new ContainsDuplicateIII();
    assertThat(iii.containsNearbyAlmostDuplicate(new int[]{-2147483648, 2147483647}, 1, 1)).isFalse();
    assertThat(iii.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0)).isTrue();
    assertThat(iii.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 1, 2)).isTrue();
    assertThat(iii.containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3)).isFalse();
  }
}