package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/perfect-number/
/*
Runtime: 1 ms, faster than 95.73% of Java online submissions for Perfect Number.
Memory Usage: 35.8 MB, less than 53.31% of Java online submissions for Perfect Number.
*/
public class PerfectNumber {

  public boolean checkPerfectNumber(int num) {
    if (num < 6) {
      return false;
    }
    long s = 1;
    for (int i = 2; i * i < num; i++) {
      if (num % i == 0) {
        s += i + num / i;
      }
    }
    return s == num;
  }
}
