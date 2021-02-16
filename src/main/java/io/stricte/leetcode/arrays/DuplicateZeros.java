package io.stricte.leetcode.arrays;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/duplicate-zeros/
/*
Runtime: 2 ms, faster than 62.85% of Java online submissions for Duplicate Zeros.
Memory Usage: 39.7 MB, less than 25.53% of Java online submissions for Duplicate Zeros.
*/
public class DuplicateZeros {

  public void duplicateZeros(int[] arr) {

    Queue<Integer> stack = new LinkedList<>();
    for (int i = 0; i < arr.length; i++) {
      stack.add(arr[i]);
      if (0 == arr[i]) {
        stack.add(0);
      }
      arr[i] = stack.remove();
    }
  }
}
