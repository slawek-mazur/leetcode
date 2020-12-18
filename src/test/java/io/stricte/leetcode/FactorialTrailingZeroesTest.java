package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class FactorialTrailingZeroesTest {

  @Test
  void test() {

    FactorialTrailingZeroes zeroes = new FactorialTrailingZeroes();

    for (int t : List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 61)) {
      System.out.println(t + " -> " + zeroes.trailingZeroes(t));
    }

    assertThat(zeroes.trailingZeroes(16)).isEqualTo(3);
    assertThat(zeroes.trailingZeroes(3)).isEqualTo(0);
    assertThat(zeroes.trailingZeroes(5)).isEqualTo(1);
    assertThat(zeroes.trailingZeroes(0)).isEqualTo(0);
  }
}