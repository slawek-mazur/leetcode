package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

  @Test
  void test() {

    var stairs = new ClimbingStairs();
    assertThat(stairs.climbStairs(1)).isEqualTo(1);
    assertThat(stairs.climbStairs(2)).isEqualTo(2);
    assertThat(stairs.climbStairs(3)).isEqualTo(3);
    assertThat(stairs.climbStairs(4)).isEqualTo(5);
    assertThat(stairs.climbStairs(5)).isEqualTo(8);
  }
}