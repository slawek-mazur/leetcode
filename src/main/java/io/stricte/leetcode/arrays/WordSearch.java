package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/word-search/
public class WordSearch {

  public boolean exist(char[][] board, String word) {

    char[] chars = word.toCharArray();
    char[] res = new char[chars.length];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == chars[0]) {
          res[0] = chars[0];
          if (helper(i, j, board, new boolean[board.length][board[0].length], 0, chars, res)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private static boolean helper(int i, int j, char[][] board, boolean[][] visited,
    int w, char[] expected, char[] actual) {

    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] ||
      board[i][j] != expected[w]) {
      return false;
    }

    if (expected.length - 1 == w) {
      return true;
    }
    actual[w] = board[i][j];
    visited[i][j] = true;

    System.out.println(board[i][j]);

    return helper(i - 1, j, board, visited, w + 1, expected, actual) ||
      helper(i, j + 1, board, visited, w + 1, expected, actual) ||
      helper(i + 1, j, board, visited, w + 1, expected, actual) ||
      helper(i, j - 1, board, visited, w + 1, expected, actual);
  }
}
