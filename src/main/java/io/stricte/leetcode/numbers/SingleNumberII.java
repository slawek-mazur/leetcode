package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/single-number-ii/
/*
Runtime: 3 ms, faster than 58.12% of Java online submissions for Single Number II.
Memory Usage: 38.9 MB, less than 48.72% of Java online submissions for Single Number II.
*/
public class SingleNumberII {

  public int singleNumber(int[] nums) {
    /*
    var map = new HashMap<Integer, Long>();
    for (int num : nums) {
      map.merge(num, 1L, (a, b) -> a + 1);
    }
    for (var e : map.entrySet()) {
      if (e.getValue() == 1) {
        return e.getKey();
      }
    }
    return -1;
    */
    int ones = 0, tows = 0;
    for (int num : nums) {
      ones = (ones ^ num) & (~tows);
      tows = (tows ^ num) & (~ones);
    }
    return ones;
  }
}
