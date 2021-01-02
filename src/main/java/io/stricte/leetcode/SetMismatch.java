package io.stricte.leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/set-mismatch/
/*
Runtime: 9 ms, faster than 39.08% of Java online submissions for Set Mismatch.
Memory Usage: 40.8 MB, less than 47.86% of Java online submissions for Set Mismatch.
*/
public class SetMismatch {

  public int[] findErrorNums(int[] nums) {

    Set<Integer> set = new HashSet<>();
    int dup = -1;
    for (int num : nums) {
      if (!set.add(num)) {
        dup = num;
      }
    }

    int miss = -1;
    for (int i = 1; i <= nums.length; i++) {
      if (!set.contains(i)) {
        miss = i;
        break;
      }
    }
    return new int[]{dup, miss};
  }
}
