package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

  @Test
  void test() {

    var triangle = new PascalsTriangle();
    assertThat(triangle.generate(4)).containsExactly(
      List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1));
    assertThat(triangle.generate(5)).containsExactly(
      List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
    assertThat(triangle.generate(6)).containsExactly(
      List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1), List.of(1, 5, 10, 10, 5, 1));
    assertThat(triangle.generate(1)).containsExactly(List.of(1));
  }
}