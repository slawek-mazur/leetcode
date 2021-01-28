package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/base-7/
/*
Runtime: 4 ms, faster than 27.47% of Java online submissions for Base 7.
Memory Usage: 36.8 MB, less than 33.94% of Java online submissions for Base 7.
 */
public class Base7 {

  public String convertToBase7(int num) {
    /*
    if (num < 0) {
      return "-" + convertToBase7(-num);
    }
    if (num < 7) {
      return num + "";
    }
    return convertToBase7(num / 7) + (num % 7);
    */
    int n = 1, res = 0;
    while (num != 0) {
      res += ((num % 7) * n);
      n *= 10;
      num /= 7;
    }
    return res + "";
  }
}
