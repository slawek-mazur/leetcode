package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class PascalsTriangleIITest {

  @Test
  void test() {

    var ii = new PascalsTriangleII();
    assertThat(ii.getRow(0)).containsExactly(1);
    assertThat(ii.getRow(1)).containsExactly(1, 1);
    assertThat(ii.getRow(2)).containsExactly(1, 2, 1);
    assertThat(ii.getRow(3)).containsExactly(1, 3, 3, 1);
    assertThat(ii.getRow(4)).containsExactly(1, 4, 6, 4, 1);
  }
}