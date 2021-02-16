package io.stricte.leetcode.strings;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/
/*

 */
public class GreatestCommonDivisorOfStrings {

  public String gcdOfStrings(String str1, String str2) {
    if ((str1 + str2).equals(str2 + str1)) {
      
      int gcd = gcd(str1.length(), str2.length());
      return str2.substring(0, gcd);
    }
    return "";
  }

  private static int gcd(int p, int q) {
    return (q == 0) ? p : gcd(q, p % q);
  }
}
