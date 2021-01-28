package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

  @Test
  void test() {

    var stairs = new MinCostClimbingStairs();
    assertThat(stairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})).isEqualTo(6);
    assertThat(stairs.minCostClimbingStairs(new int[]{10, 15, 20})).isEqualTo(15);
    assertThat(stairs.minCostClimbingStairs(new int[]{3, 3, 5, 5, 5, 1, 0, 0, 2, 5})).isEqualTo(11);
  }
}