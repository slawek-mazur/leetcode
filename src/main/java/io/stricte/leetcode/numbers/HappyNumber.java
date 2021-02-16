package io.stricte.leetcode.numbers;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/
/*
Runtime: 1 ms, faster than 85.56% of Java online submissions for Happy Number.
Memory Usage: 36.4 MB, less than 30.49% of Java online submissions for Happy Number.
*/
public class HappyNumber {

  public boolean isHappy(int n) {
    /*
    int slow = n, fast = n;
    do {
      slow = digitSquareSum(slow);
      fast = digitSquareSum(fast);
      fast = digitSquareSum(fast);

    } while (slow != fast);
    return slow == 1;
    */
    if (1 == n) {
      return true;
    }
    Set<Integer> visited = new HashSet<>();
    visited.add(n);
    while (n != 1) {
      n = digitSquareSum(n);
      System.out.println(n);
      if (visited.contains(n)) {
        return false;
      }
      visited.add(n);
    }
    return true;
  }

  private static int digitSquareSum(int n) {
    int sum = 0, tmp;
    while (n > 0) {
      tmp = n % 10;
      sum += tmp * tmp;
      n /= 10;
    }
    return sum;
  }
}
