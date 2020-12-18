package io.stricte.leetcode;

public class ValidateIpAddress {

  public String validIPAddress(String IP) {
    if (null == IP || IP.isBlank()) {
      return "Neither";
    }

    int n = IP.length();
    char[] chars = IP.toCharArray();
    int dots = 0, colons = 0;
    for (int i = 0; i < n; i++) {
      if ('.' == chars[i]) {
        dots++;
      }
      if (':' == chars[i]) {
        colons++;
      }
    }
    if (3 == dots && 0 == colons && n >= 7) {
      return checkIPv4(IP);
    }
    if (7 == colons && 0 == dots && n >= 15) {
      return checkIPv6(IP);
    }
    return "Neither";
  }

  private static String checkIPv4(String IP) {
    String[] nums = IP.split("\\.", -1);
    for (String x : nums) {
      if (x.length() == 0 || x.length() > 3 ||
        (x.charAt(0) == '0' && x.length() != 1)) {
        return "Neither";
      }

      for (char ch : x.toCharArray()) {
        if (!Character.isDigit(ch)) {
          return "Neither";
        }
      }
      if (Integer.parseInt(x) > 255) {
        return "Neither";
      }
    }
    return "IPv4";
  }

  private static String checkIPv6(String IP) {
    String hexdigits = "0123456789abcdefABCDEF";
    String[] nums = IP.split(":", -1);
    for (String x : nums) {
      if (x.length() == 0 || x.length() > 4) {
        return "Neither";
      }
      for (Character ch : x.toCharArray()) {
        if (hexdigits.indexOf(ch) == -1) {
          return "Neither";
        }
      }
    }
    return "IPv6";
  }
}
