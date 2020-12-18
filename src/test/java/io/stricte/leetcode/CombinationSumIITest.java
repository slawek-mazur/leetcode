package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class CombinationSumIITest {

  @Test
  void test() {

    var ii = new CombinationSumII();

    assertThat(ii.combinationSum2(new int[]{1, 2, 3}, 5))
      .containsExactlyInAnyOrder(List.of(2, 3));

    assertThat(ii.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8))
      .containsExactlyInAnyOrder(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
  }
}