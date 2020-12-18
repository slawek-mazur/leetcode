package io.stricte.leetcode;

public class StringToInteger {

  public int myAtoi(String str) {
    if (null == str || str.length() == 0) {
      return 0;
    }

    boolean signed = false, gotNumber = false;
    int sign = 1;
    long ans = 0;

    for (int i = 0; i < str.length(); i++) {
      final char c = str.charAt(i);

      if (' ' == c && !gotNumber && !signed) {
        continue;
      }

      if ('-' == c || '+' == c) {
        if (gotNumber) {
          break;
        }
        if (signed) {
          return 0;
        }
        signed = true;
        if ('-' == c) {
          sign = -1;
        }

      } else if (c < '0' || c > '9') {
        break;

      } else {
        gotNumber = true;

        ans = ans * 10 + (c - '0');

        if (Integer.MAX_VALUE < (ans * sign)) {
          return Integer.MAX_VALUE;
        }

        if (Integer.MIN_VALUE > (ans * sign)) {
          return Integer.MIN_VALUE;
        }
      }
    }
    return (int) (ans * sign);
  }
}
