package io.stricte.leetcode;

// https://leetcode.com/problems/check-if-it-is-a-straight-line/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If It Is a Straight Line.
Memory Usage: 40.5 MB, less than 6.51% of Java online submissions for Check If It Is a Straight Line.
*/
public class CheckIfStraightLine {

  // alternative, calculate & compare slopes
  public boolean checkStraightLine(int[][] coordinates) {
    for (int i = 2; i < coordinates.length; i++) {
      int x0 = coordinates[i - 2][0];
      int y0 = coordinates[i - 2][1];
      int x1 = coordinates[i - 1][0];
      int y1 = coordinates[i - 1][1];
      int x2 = coordinates[i][0];
      int y2 = coordinates[i][1];
      if ((y1 - y0) * (x2 - x1) != (y2 - y1) * (x1 - x0)) {
        return false;
      }
    }
    return true;
  }
  /*
  public boolean checkStraightLine(int[][] coordinates) {
    int x1 = coordinates[0][0];
    int y1 = coordinates[0][1];
    int x2 = coordinates[1][0];
    int y2 = coordinates[1][1];

    if (y1 == y2) {
      for (int i = 2; i < coordinates.length; i++) {
        if (y1 != coordinates[i][1]) {
          return false;
        }
      }

    } else if (x1 == x2) {
      for (int i = 2; i < coordinates.length; i++) {
        if (x1 != coordinates[i][0]) {
          return false;
        }
      }

    } else {
      // a = (y1 - y2) / (x1 - x2)
      // b = y1 - a * x1
      double a = (y1 - y2) / (double) (x1 - x2), b = y1 - a * x1;
      for (int i = 2; i < coordinates.length; i++) {
        if (a * coordinates[i][0] + b != coordinates[i][1]) {
          return false;
        }
      }
    }
    return true;
  }
  */
}
