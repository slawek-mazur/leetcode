package io.stricte.leetcode.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/duplicate-zeros/
/*
Runtime: 2 ms, faster than 62.85% of Java online submissions for Duplicate Zeros.
Memory Usage: 39.7 MB, less than 25.53% of Java online submissions for Duplicate Zeros.
*/
public class DuplicateZeros {

  public void duplicateZeros(int[] arr) {

    // 1, 0, 2, 3
    // 1, 0, 0, 2, 3
    int n = arr.length, j = n + (int) Arrays.stream(arr).filter(i -> i == 0).count() - 1;
    for (int i = arr.length - 1; i < j; i--, j--) {
      if (arr[i] != 0) {
        if (j < arr.length) {
          arr[j] = arr[i];
        }
      } else {
        if (j < arr.length) {
          arr[j] = arr[i];
        }
        j--;
        if (j < arr.length) {
          arr[j] = arr[i]; //copy twice when hit '0'
        }
      }
    }
    /*
    Queue<Integer> stack = new LinkedList<>();
    for (int i = 0; i < arr.length; i++) {
      stack.add(arr[i]);
      if (0 == arr[i]) {
        stack.add(0);
      }
      arr[i] = stack.remove();
    }
    */
  }
}
