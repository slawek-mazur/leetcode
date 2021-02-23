package io.stricte.leetcode;

// https://leetcode.com/problems/max-consecutive-ones/
/*
Runtime: 2 ms, faster than 59.97% of Java online submissions for Max Consecutive Ones.
Memory Usage: 40.9 MB, less than 29.38% of Java online submissions for Max Consecutive Ones.
*/
public class MaxConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {
    int c = 0, res = 0;
    for (int num : nums) {
      if (0 == num) {
        c = 0;
      } else {
        c++;
        res = Math.max(res, c);
      }
    }
    return res;
  }
}
