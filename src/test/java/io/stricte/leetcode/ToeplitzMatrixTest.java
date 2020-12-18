package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ToeplitzMatrixTest {

  @Test
  void test() {

    ToeplitzMatrix matrix = new ToeplitzMatrix();
    assertThat(matrix.isToeplitzMatrix(new int[][]{
      {1, 2, 3, 4},
      {5, 1, 2, 3},
      {9, 5, 1, 2},
    })).isTrue();
  }
}