package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class PathCrossingTest {

  @Test
  void test() {

    var crossing = new PathCrossing();
    assertThat(crossing.isPathCrossing("NES")).isFalse();
    assertThat(crossing.isPathCrossing("NESW")).isTrue();
    assertThat(crossing.isPathCrossing("NESWW")).isTrue();
  }
}