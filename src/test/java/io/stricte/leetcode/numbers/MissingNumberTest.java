package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

  @Test
  void test() {

    var missingNumber = new MissingNumber();
    assertThat(missingNumber.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
    assertThat(missingNumber.missingNumber(new int[]{0, 1})).isEqualTo(2);
    assertThat(missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }
}