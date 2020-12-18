package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class CombinationSumTest {

  @Test
  void test() {

    CombinationSum sum = new CombinationSum();

    assertThat(sum.combinationSum(new int[]{2, 3, 5}, 8))
      .containsExactlyInAnyOrder(
        List.of(2, 2, 2, 2),
        List.of(2, 3, 3),
        List.of(3, 5)
      );

    /*
    assertThat(sum.combinationSum(new int[]{2, 3, 6, 7}, 7))
      .containsExactlyInAnyOrder(
        List.of(2, 2, 3),
        List.of(7)
      );

    assertThat(sum.combinationSum(new int[]{2}, 1)).isEmpty();

    assertThat(sum.combinationSum(new int[]{1}, 1))
      .containsExactlyInAnyOrder(List.of(1));

    assertThat(sum.combinationSum(new int[]{1}, 2))
      .containsExactlyInAnyOrder(List.of(1, 1));

     */
  }
}