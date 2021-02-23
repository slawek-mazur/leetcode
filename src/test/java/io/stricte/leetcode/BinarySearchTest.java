package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  void test() {

    var search = new BinarySearch();
    assertThat(search.search(new int[]{5}, 5)).isEqualTo(0);
    assertThat(search.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)).isEqualTo(4);
    assertThat(search.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)).isEqualTo(-1);
  }
}