package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class AddArrayFormOfIntegerTest {

  @Test
  void test() {

    AddArrayFormOfInteger add = new AddArrayFormOfInteger();

    assertThat(add.addToArrayForm(null, 12)).containsExactly(1, 2);
    assertThat(add.addToArrayForm(new int[0], 45)).containsExactly(4, 5);
    assertThat(add.addToArrayForm(new int[]{1, 2, 3, 4}, 0)).containsExactly(1, 2, 3, 4);
    assertThat(add.addToArrayForm(new int[]{1, 2, 0, 0}, 34)).containsExactly(1, 2, 3, 4);
    assertThat(add.addToArrayForm(new int[]{2, 7, 4}, 181)).containsExactly(4, 5, 5);
    assertThat(add.addToArrayForm(new int[]{2, 1, 5}, 806)).containsExactly(1, 0, 2, 1);
    assertThat(add.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1))
      .containsExactly(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  }
}