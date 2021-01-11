package io.stricte.leetcode;

// https://leetcode.com/problems/rectangle-overlap/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Rectangle Overlap.
Memory Usage: 36.7 MB, less than 12.07% of Java online submissions for Rectangle Overlap.
*/
public class RectangleOverlap {

  public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
      rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
      return false;
    }
    return rec2[0] < rec1[2] && rec2[2] > rec1[0] &&
      rec2[3] > rec1[1] && rec1[3] > rec2[1];
  }
}
