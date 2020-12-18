package io.stricte.leetcode;

import java.util.Arrays;

public class NextPermutation {

  public void nextPermutation(int[] nums) {
    if (null == nums || nums.length < 2) {
      return;
    }

    int pop = nums[nums.length - 1];
    int breakingIndex = -1;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] < pop) {
        breakingIndex = i;
        break;
      }
      pop = nums[i];
    }
    if (-1 == breakingIndex) {
      Arrays.sort(nums);
      return;
    }
    //System.out.println("bi=" + breakingIndex + ", v=" + nums[breakingIndex]);
    int min = Integer.MAX_VALUE, mini = -1;
    for (int i = nums.length - 1; i > breakingIndex; i--) {
      if (nums[i] > nums[breakingIndex] && nums[i] < min) {
        min = nums[i];
        mini = i;
      }
    }
    //System.out.println("min=" + min + ", mini=" + mini);
    int t = nums[breakingIndex];
    nums[breakingIndex] = min;
    nums[mini] = t;
    //System.out.println(Arrays.toString(nums));

    for (int i = breakingIndex + 1; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          int tt = nums[j];
          nums[j] = nums[i];
          nums[i] = tt;
        }
      }
    }
  }
}
