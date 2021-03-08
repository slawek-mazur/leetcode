package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
Memory Usage: 36.9 MB, less than 51.73% of Java online submissions for Pascal's Triangle.
 */
public class PascalsTriangle {

  /*
  1
  1 1
  1 2 1
  1 3 3 1
   */

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    res.add(List.of(1));
    for (int i = 2; i <= numRows; i++) {
      List<Integer> list = new ArrayList<>(i + 1);
      list.add(1);
      for (int j = 0; j < i - 2; j++) {
        list.add(res.get(i - 2).get(j) + (int) res.get(i - 2).get(j + 1));
      }
      list.add(1);
      res.add(list);
    }
    return res;
  }
}
