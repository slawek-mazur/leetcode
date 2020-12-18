package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class NonDecreasingArrayTest {

  @Test
  void test() {

    NonDecreasingArray array = new NonDecreasingArray();
//    assertThat(array.checkPossibility(new int[]{4, 2, 3})).isTrue();
//    assertThat(array.checkPossibility(new int[]{4, 2, 1})).isFalse();
    assertThat(array.checkPossibility(new int[]{3, 4, 2, 3})).isFalse();
  }
}