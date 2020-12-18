package io.stricte.leetcode;

import java.util.Arrays;

public class MultiplyStringsAlt {

  public static String multiply(String num1, String num2) {
    char[] s1 = num1.toCharArray();
    char[] s2 = num2.toCharArray();
    int M = s1.length, N = s2.length;
    int[] arr = new int[M + N];
    for (int i = M - 1; i >= 0; i--) {
      for (int j = N - 1; j >= 0; j--) {
        arr[i + j + 1] += (s1[i] - '0') * (s2[j] - '0');
      }
    }

    System.out.println(Arrays.toString(arr));

    int carry = 0;
    for (int i = M + N - 1; i >= 0; i--) {
      int sum = carry + arr[i];
      arr[i] = sum % 10;
      carry = sum / 10;
    }

    System.out.println(Arrays.toString(arr));

    return "";
  }
}
