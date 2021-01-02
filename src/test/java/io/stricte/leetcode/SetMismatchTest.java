package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SetMismatchTest {

  @Test
  void test() {

    var mismatch = new SetMismatch();

    assertThat(mismatch.findErrorNums(new int[]{1, 1}))
      .containsExactlyInAnyOrder(1, 2);

    assertThat(mismatch.findErrorNums(new int[]{1, 2, 2, 4}))
      .containsExactlyInAnyOrder(2, 3);

    assertThat(mismatch.findErrorNums(new int[]{1, 2, 3, 4, 2, 6, 7, 8, 9, 10}))
      .containsExactlyInAnyOrder(2, 5);
  }
}