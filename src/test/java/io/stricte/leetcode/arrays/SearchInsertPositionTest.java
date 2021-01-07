package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

  @Test
  void test() {

    var position = new SearchInsertPosition();

    assertThat(position.searchInsert(new int[]{1, 3}, 2)).isEqualTo(1);
    assertThat(position.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    assertThat(position.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    assertThat(position.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    assertThat(position.searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
    assertThat(position.searchInsert(new int[]{1}, 0)).isEqualTo(0);
  }
}