package io.stricte.leetcode;

public class ToeplitzMatrix {

  public boolean isToeplitzMatrix(int[][] matrix) {
    if (null == matrix ||
      matrix.length < 2 ||
      matrix[0].length < 2) {
      return true;
    }

    int m = matrix.length, n = matrix[0].length;
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] != matrix[i - 1][j - 1]) {
          return false;
        }
      }
    }
    return true;
  }
}
