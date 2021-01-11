package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {

  @Test
  void test() {

    var index = new FindPivotIndex();
    assertThat(index.pivotIndex(new int[0])).isEqualTo(-1);
    assertThat(index.pivotIndex(new int[]{1})).isEqualTo(0);
    assertThat(index.pivotIndex(new int[]{1, 0})).isEqualTo(0);
    assertThat(index.pivotIndex(new int[]{1, 2, 3})).isEqualTo(-1);
    assertThat(index.pivotIndex(new int[]{1, 7, 3, 6, 5, 6})).isEqualTo(3);
  }
}