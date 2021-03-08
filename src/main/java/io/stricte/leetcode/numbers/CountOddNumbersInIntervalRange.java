package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.
Memory Usage: 36 MB, less than 24.81% of Java online submissions for Count Odd Numbers in
 */
public class CountOddNumbersInIntervalRange {

  public int countOdds(int low, int high) {
    if ((low & 1) == 1 && (high & 1) == 1) {
      return (high - low + 2) / 2;

    } else if ((low & 1) != 1 && (high & 1) != 1) {
      return (high - low) / 2;
    }
    return (high - low + 1) / 2;
  }
}
