package io.stricte.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {

  public boolean checkIfExist(int[] arr) {
    if (null == arr || arr.length < 2) {
      return false;
    }

    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
      if (set.contains(num * 2) ||
        ((0 == num % 2) && set.contains(num / 2))) {
        return true;
      }
      set.add(num);
    }
    return false;
  }
}
