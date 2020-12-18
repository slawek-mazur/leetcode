package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CreateMaximumNumberTest {

  @Test
  void test() {

    var number = new CreateMaximumNumber();

    assertThat(number.maxNumber(
      null,
      new int[]{1, 2, 3, 4}, 2
    )).containsExactly(1, 2);

    assertThat(number.maxNumber(
      new int[]{1, 2, 3, 4},
      null, 3
    )).containsExactly(1, 2, 3);

    assertThat(number.maxNumber(
      new int[]{3, 9},
      new int[]{8, 9}, 3
    )).containsExactly(9, 8, 9);

    assertThat(number.maxNumber(
      new int[]{3, 4, 6, 5},
      new int[]{9, 1, 2, 5, 8, 3}, 5
    )).containsExactly(9, 8, 6, 5, 3);

    assertThat(number.maxNumber(
      new int[]{6, 7},
      new int[]{6, 0, 4}, 5
    )).containsExactly(6, 7, 6, 0, 4);
  }
}