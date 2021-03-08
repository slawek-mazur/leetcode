package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CountOddNumbersInIntervalRangeTest {

  @Test
  void test() {

    var numbers = new CountOddNumbersInIntervalRange();
    assertThat(numbers.countOdds(1, 5)).isEqualTo(3);
    assertThat(numbers.countOdds(3, 8)).isEqualTo(3);
    assertThat(numbers.countOdds(3, 7)).isEqualTo(3);
    assertThat(numbers.countOdds(8, 10)).isEqualTo(1);
  }
}