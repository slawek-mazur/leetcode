package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FindAllNumbersDisappearedInArrayTest {

  @Test
  void test() {

    var disappeared = new FindAllNumbersDisappearedInArray();

    assertThat(disappeared.findDisappearedNumbers(new int[]{1, 1, 1, 2, 2, 2, 2}))
      .containsExactly(3, 4, 5, 6, 7);
    assertThat(disappeared.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}))
      .containsExactly(5, 6);
  }
}