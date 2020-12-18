package io.stricte.leetcode.strings;

// https://leetcode.com/problems/excel-sheet-column-title/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
Memory Usage: 36.1 MB, less than 76.76% of Java online submissions for Excel Sheet Column Title.

*/
public class ExcelSheetColumnTitle {

  public String convertToTitle(int n) {
    return 0 == n ? "" : convertToTitle(--n / 26) + (char) ('A' + n % 26);
  }
}
