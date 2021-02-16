package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MinimumIndexSumOfTwoListsTest {

  @Test
  void test() {

    var sum = new MinimumIndexSumOfTwoLists();
    assertThat(sum.findRestaurant(
      new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
      new String[]{"KFC", "Shogun", "Burger King"})

    ).containsExactlyInAnyOrder("Shogun");

    assertThat(sum.findRestaurant(
      new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
      new String[]{"KFC", "Shogun", "Burger King"})

    ).containsExactlyInAnyOrder("Shogun");

    assertThat(sum.findRestaurant(
      new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
      new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"})

    ).containsExactlyInAnyOrder("KFC", "Burger King", "Tapioca Express", "Shogun");

    assertThat(sum.findRestaurant(
      new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
      new String[]{"KNN", "KFC", "Burger King", "Tapioca Express", "Shogun"})

    ).containsExactlyInAnyOrder("KFC", "Burger King", "Tapioca Express", "Shogun");

    assertThat(sum.findRestaurant(
      new String[]{"KFC"},
      new String[]{"KFC"})

    ).containsExactlyInAnyOrder("KFC");
  }
}