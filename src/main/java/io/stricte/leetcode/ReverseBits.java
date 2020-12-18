package io.stricte.leetcode;

// https://leetcode.com/problems/reverse-bits/
/*
Runtime: 1 ms, faster than 98.71% of Java online submissions for Reverse Bits.
Memory Usage: 39 MB, less than 28.21% of Java online submissions for Reverse Bits.
*/
public class ReverseBits {

  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int answer = 0;
    for (int i = 0; i < 32; i++) {
      answer <<= 1;
      answer = answer | (n & 1);
      n >>= 1;
    }
    return answer;
  }
}
