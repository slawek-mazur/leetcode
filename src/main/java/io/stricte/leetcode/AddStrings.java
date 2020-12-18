package io.stricte.leetcode;

public class AddStrings {

  public String addStrings(String num1, String num2) {
    if (null == num1) {
      return num2;
    }
    if (null == num2) {
      return num1;
    }

    char[] chars1 = num1.toCharArray();
    char[] chars2 = num2.toCharArray();

    int i = chars1.length - 1, j = chars2.length - 1, v, curry = 0;
    StringBuilder res = new StringBuilder();

    while (0 <= i && 0 <= j) {
      v = curry + (chars1[i--] - '0') + (chars2[j--] - '0');
      curry = v / 10;
      res.insert(0, v % 10);
    }

    while (0 <= i) {
      v = curry + (chars1[i--] - '0');
      curry = v / 10;
      res.insert(0, v % 10);
    }

    while (0 <= j) {
      v = curry + (chars2[j--] - '0');
      curry = v / 10;
      res.insert(0, v % 10);
    }

    if (curry > 0) {
      res.insert(0, curry);
    }

    return res.toString();
  }
}
