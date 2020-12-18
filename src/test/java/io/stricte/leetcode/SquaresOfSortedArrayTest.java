package io.stricte.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SquaresOfSortedArrayTest {

  @Test
  void test() {

    SquaresOfSortedArray array = new SquaresOfSortedArray();

    System.out.println(Arrays.toString(array.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    System.out.println(Arrays.toString(array.sortedSquares(new int[]{-7, -3, 2, 3, 11})));
  }
}