package io.stricte.leetcode;

public class MultiplyStrings {

  public String multiply(String num1, String num2) {
    if (null == num1 || null == num2 || num1.length() < 1 || num2.length() < 1) {
      return "";
    }

    int N1 = num1.length(), N2 = num2.length();
    char[] n1 = num1.toCharArray(), n2 = num2.toCharArray();
    int[] product = new int[N1 + N2];
    int v, carry;
    for (int i = N1 - 1; i >= 0; i--) {
      carry = 0;
      for (int j = N2 - 1; j >= 0; j--) {
        v = product[i + j + 1] + carry + ((n1[i] - '0') * (n2[j] - '0'));
        product[i + j + 1] = v % 10;
        carry = (v > 9) ? v / 10 : 0;
      }
      product[i] += carry;
    }
    StringBuilder ans = new StringBuilder();
    for (int value : product) {
      if (ans.length() > 0 || value > 0) {
        ans.append(value);
      }
    }
    return 0 == ans.length() ? "0" : ans.toString();
  }
}
