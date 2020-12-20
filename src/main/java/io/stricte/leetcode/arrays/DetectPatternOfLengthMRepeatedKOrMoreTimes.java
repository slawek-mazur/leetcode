package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Detect Pattern of Length M Repeated K or More Times.
Memory Usage: 36.5 MB, less than 75.51% of Java online submissions for Detect Pattern of Length M Repeated K or More Times.
 */
public class DetectPatternOfLengthMRepeatedKOrMoreTimes {

  public boolean containsPattern(int[] arr, int m, int k) {
    for (int i = 0, j = i + m, count = 0; j < arr.length; ++i, ++j) {
      if (arr[i] == arr[i + m]) {
        count++;
      } else {
        count = 0;
      }

      if (count == m * (k - 1)) {
        return true;
      }
    }
    return false;
  }
}
