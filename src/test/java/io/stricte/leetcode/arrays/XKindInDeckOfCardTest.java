package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class XKindInDeckOfCardTest {

  @Test
  void test() {

    var card = new XKindInDeckOfCard();
    assertThat(card.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2})).isTrue();
    assertThat(card.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1})).isTrue();
    assertThat(card.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3})).isFalse();
    assertThat(card.hasGroupsSizeX(new int[]{1})).isFalse();
    assertThat(card.hasGroupsSizeX(new int[]{1, 1})).isTrue();
  }
}