package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SubrectangleQueriesTest {

  @Test
  void test() {

    var queries = new SubrectangleQueries(new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
    queries.updateSubrectangle(0, 0, 3, 2, 5);
    assertThat(queries.getValue(0, 2)).isEqualTo(5);
    queries.updateSubrectangle(3, 0, 3, 2, 10);
    assertThat(queries.getValue(3, 1)).isEqualTo(10);
    assertThat(queries.getValue(0, 2)).isEqualTo(5);
  }
}