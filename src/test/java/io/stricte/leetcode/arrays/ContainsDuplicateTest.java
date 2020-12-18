package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

  @Test
  void test() {

    ContainsDuplicate duplicate = new ContainsDuplicate();

    assertThat(duplicate.containsDuplicate(null)).isFalse();
    assertThat(duplicate.containsDuplicate(new int[0])).isFalse();
    assertThat(duplicate.containsDuplicate(new int[]{1, 1})).isTrue();
    assertThat(duplicate.containsDuplicate(new int[]{1, 1, 1})).isTrue();
    assertThat(duplicate.containsDuplicate(new int[]{1, 2, 3, 1})).isTrue();
    assertThat(duplicate.containsDuplicate(new int[]{1, 2, 3, 4})).isFalse();
    assertThat(duplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isTrue();
  }
}