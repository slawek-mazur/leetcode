package io.stricte.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
/*
Runtime: 5 ms, faster than 77.90% of Java online submissions for Find All Numbers Disappeared in an Array.
Memory Usage: 48.2 MB, less than 34.64% of Java online submissions for Find All Numbers Disappeared in an Array.
*/
public class FindAllNumbersDisappearedInArray {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    /*
    Set<Integer> res = new LinkedHashSet<>();
    for (int i = 1; i <= nums.length; i++) {
      res.add(i);
    }
    for (int num : nums) {
      res.remove(num);
    }
    return new ArrayList<>(res);
    */
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < nums.length; ++i) {
      int n = Math.abs(nums[i]);
      if (nums[n - 1] > 0) {
        nums[n - 1] = -nums[n - 1];
      }
    }
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] > 0) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
