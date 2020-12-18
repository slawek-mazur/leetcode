package io.stricte.leetcode.arrays;

import org.junit.jupiter.api.Test;

class SubarraySumTest {

  @Test
  void test() {

    SubarraySum sum = new SubarraySum();

    System.out.println(sum.subarraySum(new int[]{1, 2, 3}, 5));
    //System.out.println(sum.subarraySum(new int[]{1, 1, 1}, 1));
    //System.out.println(sum.subarraySum(new int[]{100, 1, 2, 3, 4}, 6));

    //System.out.println(sum.subarraySum(new int[]{1, 1, 0, 1}, 1));
    //System.out.println(sum.subarraySum(new int[]{1, 2, 5, 2, 1}, 3));
    //System.out.println(sum.subarraySum(new int[]{1, 2, 5, 4, -1}, 3));

    //System.out.println(sum.subarraySum(new int[]{1, 2, 5, 2, 1}, 5));

    //System.out.println(sum.subarraySum(new int[]{5, 0, 0, 0}, 5));
  }
}