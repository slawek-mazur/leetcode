package io.stricte.leetcode;

// https://leetcode.com/problems/maximum-swap/
public class MaximumSwap {

  public int maximumSwap(int num) {
    if (num < 12) {
      return num;
    }

    char[] nums = (num + "").toCharArray();
    int[] indices = new int[10];

    for (int i = 0; i < nums.length; i++) {
      indices[nums[i] - '0'] = i;
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = 9; j > (nums[i] - '0'); j--) {

        if (indices[j] > i) {
          char t = nums[i];
          nums[i] = nums[indices[j]];
          nums[indices[j]] = t;

          int res = 0;
          for (int k = nums.length - 1, pow = 0; k >= 0; k--, pow++) {
            res += (nums[k] - '0') * Math.pow(10, pow);
          }
          return res;
        }
      }
    }
    return num;
  }
}
