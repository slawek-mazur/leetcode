package io.stricte.leetcode;

// https://leetcode.com/problems/kth-missing-positive-number/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Missing Positive Number.
Memory Usage: 38.9 MB, less than 19.66% of Java online submissions for Kth Missing Positive Number.
*/
public class KthMissingPositiveNumber {

  public int findKthPositive(int[] arr, int k) {

    //  ,2,3,4, , ,7, , ,  ,11
    // 1,2,3,4,5,6,7,8,9,10,11
    for (int i = 0, j = 1, s = 0; ; j++) {
      if (arr[i] != j) {
        s++;
      } else {
        i = i + 1 < arr.length ? i + 1 : i;
      }

      if (s == k) {
        return j;
      }
    }
  }
}
