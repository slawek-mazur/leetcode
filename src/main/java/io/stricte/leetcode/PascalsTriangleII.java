package io.stricte.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/pascals-triangle-ii/
/*
Runtime: 1 ms, faster than 77.35% of Java online submissions for Pascal's Triangle II.
Memory Usage: 36.9 MB, less than 50.97% of Java online submissions for Pascal's Triangle II.
*/
public class PascalsTriangleII {

  public List<Integer> getRow(int rowIndex) {
    int[] arr = new int[rowIndex + 1];
    arr[0] = 1;

    for (int i = 1; i <= rowIndex; i++) {
      for (int j = i; j > 0; j--) {
        arr[j] = arr[j] + arr[j - 1];
      }
    }
    return Arrays.stream(arr).boxed().collect(Collectors.toList());
  }
}
