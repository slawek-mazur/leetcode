package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CheckIfNAndItsDoubleExistTest {

  @Test
  void test() {

    var exist = new CheckIfNAndItsDoubleExist();
    assertThat(exist.checkIfExist(null)).isFalse();
    assertThat(exist.checkIfExist(new int[0])).isFalse();
    assertThat(exist.checkIfExist(new int[]{10, 2, 5, 3})).isTrue();
    assertThat(exist.checkIfExist(new int[]{7, 1, 14, 11})).isTrue();
    assertThat(exist.checkIfExist(new int[]{3, 1, 7, 11})).isFalse();
    assertThat(exist.checkIfExist(new int[]{4, -7, 11, 4, 18})).isFalse();
  }
}