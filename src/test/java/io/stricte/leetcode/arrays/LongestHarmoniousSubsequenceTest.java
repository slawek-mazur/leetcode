package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class LongestHarmoniousSubsequenceTest {

  @Test
  void test() {

    var subsequence = new LongestHarmoniousSubsequence();
    assertThat(subsequence.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7})).isEqualTo(5);
    assertThat(subsequence.findLHS(new int[]{1, 2, 3, 4})).isEqualTo(2);
    assertThat(subsequence.findLHS(new int[]{1, 1, 1, 1})).isEqualTo(0);
  }
}