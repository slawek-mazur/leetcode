package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddArrayFormOfInteger {

  public List<Integer> addToArrayForm(int[] A, int K) {
    List<Integer> res = new ArrayList<>();

    int index = A.length - 1, v, curry = 0;
    while (K > 0 && 0 <= index) {
      v = K % 10 + A[index--] + curry;
      curry = v / 10;
      res.add(0, v % 10);
      K /= 10;
    }

    while (K > 0) {
      v = K % 10 + curry;
      curry = v / 10;
      res.add(0, v % 10);
      K /= 10;
    }

    while (0 <= index) {
      v = A[index--] + curry;
      curry = v / 10;
      res.add(0, v % 10);
    }

    if (curry > 0) {
      res.add(0, curry);
    }

    return res;
  }
}
