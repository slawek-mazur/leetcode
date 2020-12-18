package io.stricte.leetcode.numbers;

// https://leetcode.com/problems/power-of-four/
/*
Runtime: 1 ms, faster than 99.07% of Java online submissions for Power of Four.
Memory Usage: 35.9 MB, less than 86.84% of Java online submissions for Power of Four.
*/
public class PowerOfFour {

  public boolean isPowerOfFour(int n) {
    /*
    First,greater than 0.
    Second,only have one '1' bit in their binary notation,so we use x&(x-1) to delete the lowest '1',and if then it becomes 0,it prove that there is only one '1' bit.
    Third,the only '1' bit should be locate at the odd location,for example,16.It's binary is 00010000.So we can use '0x55555555' to check if the '1' bit is in the right place.
    0x55555555 is a hexametrical number，it is 1010101010101010101010101010101 in binary with a length of 32
    */
    return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
  }
}
