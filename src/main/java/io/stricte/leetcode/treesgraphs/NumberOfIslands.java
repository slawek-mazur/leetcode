package io.stricte.leetcode.treesgraphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NumberOfIslands {

  public int numIslands(char[][] grid) {
    if (null == grid || 0 == grid.length || 0 == grid[0].length) {
      return 0;
    }

    final int h = grid.length, w = grid[0].length;
    final boolean[][] visited = new boolean[h][w];
    final List<Pair> directions = List.of(
      new Pair(-1, 0), new Pair(0, 1), new Pair(1, 0), new Pair(0, -1)
    );

    int ans = 0;
    for (int r = 0; r < h; r++) {
      for (int c = 0; c < w; c++) {
        if ('1' != grid[r][c] || visited[r][c]) {
          continue;
        }
        ans++;

        Deque<Pair> neighbors = new LinkedList<>();
        neighbors.add(new Pair(r, c));

        while (!neighbors.isEmpty()) {
          Pair p = neighbors.pop();
          if (visited[p.r][p.c]) {
            continue;
          }
          visited[p.r][p.c] = true;

          for (Pair dir : directions) {
            int row = p.r + dir.r;
            int column = p.c + dir.c;
            if (0 <= row && row < h && 0 <= column && column < w &&
              '1' == grid[row][column] && !visited[row][column]) {

              neighbors.add(new Pair(row, column));
            }
          }
        }
      }
    }
    return ans;
  }

  public int numIslandsAlt(char[][] grid) {
    if (null == grid || 0 == grid.length || 0 == grid[0].length) {
      return 0;
    }

    final int rows = grid.length;
    final int cols = grid[0].length;

    int ans = 0;
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        if ('1' == grid[r][c]) {
          ans++;
          dfs(grid, r, c);
        }
      }
    }
    return ans;
  }

  private static void dfs(char[][] g, int row, int col) {
    if (row < 0 || row >= g.length || col < 0 || col >= g[0].length || g[row][col] != '1') {
      return;
    }

    g[row][col] = '0';

    dfs(g, row - 1, col);
    dfs(g, row + 1, col);
    dfs(g, row, col - 1);
    dfs(g, row, col + 1);
  }

  private static class Pair {

    int r, c;

    Pair(int r, int c) {
      this.r = r;
      this.c = c;
    }

    @Override
    public String toString() {
      return "(" + r + ", " + c + ')';
    }
  }
}
