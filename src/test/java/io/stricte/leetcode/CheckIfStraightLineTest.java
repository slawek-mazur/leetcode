package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CheckIfStraightLineTest {

  @Test
  void test() {

    var line = new CheckIfStraightLine();
    assertThat(line.checkStraightLine(new int[][]{{2, 1}, {4, 2}, {6, 3}})).isTrue();
    assertThat(line.checkStraightLine(new int[][]{{0, 0}, {100, 100}})).isTrue();
    assertThat(line.checkStraightLine(new int[][]{{5, 4}, {3, 4}, {174, 4}})).isTrue();
    assertThat(line.checkStraightLine(new int[][]{{1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}})).isTrue();
    assertThat(line.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}})).isTrue();
    assertThat(line.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}})).isFalse();
  }
}