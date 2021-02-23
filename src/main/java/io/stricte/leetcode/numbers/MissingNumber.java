package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/missing-number/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
Memory Usage: 39.3 MB, less than 71.18% of Java online submissions for Missing Number.
*/
public class MissingNumber {

  public int missingNumber(int[] nums) {

    int n = nums[0], s = 0;
    boolean hasZero = false;
    for (int num : nums) {
      n = Math.max(n, num);
      s += num;
      if (0 == num) {
        hasZero = true;
      }
    }
    if (!hasZero) {
      return 0;
    }
    int diff = n * (n + 1) / 2 - s;
    return 0 == diff ? n + 1 : diff;
  }
}
