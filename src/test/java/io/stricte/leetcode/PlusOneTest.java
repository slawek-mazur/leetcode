package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class PlusOneTest {

  @Test
  void test() {

    var plusOne = new PlusOne();

    assertThat(plusOne.plusOne(new int[]{9})).containsExactly(1, 0);
    assertThat(plusOne.plusOne(new int[]{1, 2, 3})).containsExactly(1, 2, 4);
    assertThat(plusOne.plusOne(new int[]{4, 3, 2, 1})).containsExactly(4, 3, 2, 2);
    assertThat(plusOne.plusOne(new int[]{0})).containsExactly(1);
    assertThat(plusOne.plusOne(new int[]{8, 9, 9})).containsExactly(9, 0, 0);
  }
}