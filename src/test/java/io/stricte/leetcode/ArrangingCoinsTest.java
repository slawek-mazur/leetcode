package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ArrangingCoinsTest {

  @Test
  void test() {

    var coins = new ArrangingCoins();

    assertThat(coins.arrangeCoins(1)).isEqualTo(1);
    assertThat(coins.arrangeCoins(2)).isEqualTo(1);
    assertThat(coins.arrangeCoins(3)).isEqualTo(2);
    assertThat(coins.arrangeCoins(4)).isEqualTo(2);
    assertThat(coins.arrangeCoins(5)).isEqualTo(2);
    assertThat(coins.arrangeCoins(6)).isEqualTo(3);
    assertThat(coins.arrangeCoins(8)).isEqualTo(3);
  }
}