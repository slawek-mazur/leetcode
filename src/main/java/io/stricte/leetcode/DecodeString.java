package io.stricte.leetcode;

public class DecodeString {

  private int i;

  public String decodeString(String s) {
    i = 0;
    if (null == s || s.isBlank()) {
      return s;
    }

    return helper(s.toCharArray());
  }

  private String helper(char[] chars) {

    StringBuilder res = new StringBuilder();
    for (; i < chars.length; i++) {
      char aChar = chars[i];

      if (']' == aChar) {
        break;
      }

      int times = 0;
      while (aChar >= '0' && aChar <= '9') {
        times = times * 10 + (aChar - '0');
        aChar = chars[++i];
      }

      if ('[' == aChar) {
        ++i;
        String toRepeat = helper(chars);
        res.append(toRepeat.repeat(times));
      }

      if (aChar >= 'a' && aChar <= 'z' || aChar >= 'A' && aChar <= 'Z') {
        res.append(aChar);
      }
    }
    return res.toString();
  }
}
