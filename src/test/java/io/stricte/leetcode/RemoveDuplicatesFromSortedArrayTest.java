package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

  @Test
  void test() {

    var duplicates = new RemoveDuplicatesFromSortedArray();
    int[] nums = {1, 2, 3};
    assertThat(duplicates.removeDuplicates(nums)).isEqualTo(3);
  }
}