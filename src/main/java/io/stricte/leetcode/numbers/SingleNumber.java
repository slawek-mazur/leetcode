package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/single-number/
/*
Runtime: 1 ms, faster than 96.29% of Java online submissions for Single Number.
Memory Usage: 38.9 MB, less than 93.74% of Java online submissions for Single Number.
*/
public class SingleNumber {

  public int singleNumber(int[] nums) {

    int res = 0;
    for (int num : nums) {
      res ^= num;
    }
    return res;
  }
}
