package io.stricte.leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/path-crossing/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Crossing.
Memory Usage: 37.1 MB, less than 99.84% of Java online submissions for Path Crossing.
*/
public class PathCrossing {

  public boolean isPathCrossing(String path) {
    int x = 0, y = 0, t;
    Set<Integer> visited = new HashSet<>();
    visited.add(0);
    for (char c : path.toCharArray()) {
      switch (c) {
        case 'N':
          y++;
          break;
        case 'S':
          y--;
          break;
        case 'W':
          x--;
          break;
        case 'E':
          x++;
          break;
      }
      t = (x << 10) + y;
      //System.out.println(t + "-> " + Integer.toBinaryString(t));
      if (!visited.add(t)) {
        return true;
      }
    }
    return false;
  }
}
