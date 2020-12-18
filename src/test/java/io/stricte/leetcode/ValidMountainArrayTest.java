package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ValidMountainArrayTest {

  @Test
  void test() {
    ValidMountainArray array = new ValidMountainArray();
    assertThat(array.validMountainArray(new int[]{2, 1})).isFalse();
    assertThat(array.validMountainArray(new int[]{3, 5, 5})).isFalse();
    assertThat(array.validMountainArray(new int[]{0, 3, 2, 1})).isTrue();
  }
}