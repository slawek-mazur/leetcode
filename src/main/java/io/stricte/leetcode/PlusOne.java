package io.stricte.leetcode;

// https://leetcode.com/problems/plus-one/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
Memory Usage: 37.8 MB, less than 22.77% of Java online submissions for Plus One.
*/
public class PlusOne {

  public int[] plusOne(int[] digits) {

    int carry = 0, n = digits.length;
    digits[n - 1] += 1;
    for (int i = n - 1; i >= 0; i--) {
      int t = digits[i] + carry;
      digits[i] = t % 10;
      carry = t / 10;
    }

    if (carry > 0) {
      int[] nums = new int[n + 1];
      System.arraycopy(digits, 0, nums, 1, n);
      nums[0] = carry;
      return nums;
    }
    return digits;
  }
}
