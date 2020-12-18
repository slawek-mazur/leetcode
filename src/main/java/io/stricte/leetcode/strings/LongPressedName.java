package io.stricte.leetcode.strings;

// https://leetcode.com/problems/long-pressed-name/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Long Pressed Name.
Memory Usage: 37.4 MB, less than 21.14% of Java online submissions for Long Pressed Name.
*/
public class LongPressedName {

  public boolean isLongPressedName(String name, String typed) {
    if (name.equals(typed)) {
      return true;
    }

    if (name.length() > typed.length()) {
      return false;
    }

    char[] names = name.toCharArray();
    char[] typeds = typed.toCharArray();

    char cn = names[0], ct = typeds[0];
    int i = 0, j = 0, ccn = 0, cct = 0;
    while (i < names.length && j < typeds.length) {
      if (cn != ct || ccn > cct) {
        return false;
      }
      ccn = 0;
      while (i < names.length && names[i] == cn) {
        i++;
        ccn++;
      }
      cn = i == names.length ? names[names.length - 1] : names[i];

      cct = 0;
      while (j < typeds.length && typeds[j] == ct) {
        j++;
        cct++;
      }
      ct = j == typeds.length ? typeds[typeds.length - 1] : typeds[j];
    }
    return i == names.length && j == typeds.length;
  }
}
