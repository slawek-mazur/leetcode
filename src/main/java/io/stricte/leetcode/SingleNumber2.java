package io.stricte.leetcode;

public class SingleNumber2 {

  public int singleNumber(int[] nums) {

    int ones = 0, tows = 0;
    for (int num : nums) {
      ones = (ones ^ num) & (~tows);
      tows = (tows ^ num) & (~ones);
    }
    return ones;
  }
}
