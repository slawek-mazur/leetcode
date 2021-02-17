package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class DuplicateZerosTest {

  @Test
  void test() {

    var zeros = new DuplicateZeros();

    int[] nums4 = {0, 1, 7, 6, 0, 2, 0, 7};
    zeros.duplicateZeros(nums4);
    assertThat(nums4).containsExactly(0, 0, 1, 7, 6, 0, 0, 2);

    int[] nums5 = {1, 0, 2, 3};
    zeros.duplicateZeros(nums5);
    assertThat(nums5).containsExactly(1, 0, 0, 2);

    int[] nums1 = {1, 0, 2, 3, 0, 4, 5, 0};
    zeros.duplicateZeros(nums1);
    assertThat(nums1).containsExactly(1, 0, 0, 2, 3, 0, 0, 4);

    int[] nums2 = {1, 2, 3};
    zeros.duplicateZeros(nums2);
    assertThat(nums2).containsExactly(1, 2, 3);

    int[] nums3 = {1, 0, 0, 2, 3, 4};
    zeros.duplicateZeros(nums3);
    assertThat(nums3).containsExactly(1, 0, 0, 0, 0, 2);


  }
}