package io.stricte.leetcode;

public class ValidMountainArray {

  public boolean validMountainArray(int[] arr) {
    if (null == arr || arr.length < 3) {
      return false;
    }

    int n = arr.length, i = 1;
    while (i < n && arr[i - 1] < arr[i]) {
      i++;
    }

    if (1 == i || i == n) {
      return false;
    }

    while (i < n && arr[i - 1] > arr[i]) {
      i++;
    }

    return i == n;
  }
}
