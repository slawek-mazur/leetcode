package io.stricte.leetcode;

import java.util.Random;

public class RandomPickWithWeight {

  private static final Random RAND = new Random();

  private final int[] arr;

  public RandomPickWithWeight(int[] w) {
    arr = new int[w.length];
    arr[0] = w[0];
    for (int i = 1; i < w.length; i++) {
      arr[i] = w[i] + arr[i - 1];
    }
  }

  public int pickIndex() {
    int index = RAND.nextInt(arr[arr.length - 1]) + 1;

    int l = 0, r = arr.length - 1, m;

    while (l < r) {
      m = l + (r - l) / 2;

      if (arr[m] == index) {
        return m;
      }

      if (arr[m] < index) {
        l = m + 1;

      } else {
        r = m;
      }
    }
    return l;
  }
}
