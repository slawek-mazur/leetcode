package io.stricte.leetcode;

public class SquaresOfSortedArray {

  public int[] sortedSquares(int[] A) {
    if (null == A || A.length < 1) {
      return A;
    }

    int p = A.length - 1, i = 0, j = p;
    int[] ans = new int[A.length];

    while (i <= j) {
      ans[p--] = A[i] * A[i] > A[j] * A[j] ?
        A[i] * A[i++] : A[j] * A[j--];
    }
    return ans;
  }
}
