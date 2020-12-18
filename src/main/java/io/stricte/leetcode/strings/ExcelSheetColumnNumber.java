package io.stricte.leetcode.strings;

// https://leetcode.com/problems/excel-sheet-column-number/
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 38.8 MB, less than 85.45% of Java online submissions for Excel Sheet Column Number.
*/
public class ExcelSheetColumnNumber {

  public int titleToNumber(String s) {

    if (null == s || s.isEmpty()) {
      return 0;
    }
    return titleToNumber(s.substring(0, s.length() - 1)) * 26 + s.charAt(s.length() - 1) - '@';
  }
}
