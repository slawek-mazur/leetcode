package io.stricte.leetcode;

public class NthDigit {

  public int findNthDigit(int n) {

    /*
    0-9 = 9-0+1 = 10
    10-99 = 99-10+1 = 90 * 2 = 180
    100-999 = 900 * 3 = 2700
    1000-9999 = 9000 * 4 = 36000
    10000-99999 = 90000 * 5 = 45000
    */

    int a = 0, c = 60, t = 0;

    while (a < c) {
      int tenTh = (int) Math.pow(10, t);

      System.out.println(String.format("%d t=%d 10^%d=%d", a, t, t, tenTh));

      a++;
      if (a % 10 == 0) {
        t++;
      }
    }

    return n;
  }
}
