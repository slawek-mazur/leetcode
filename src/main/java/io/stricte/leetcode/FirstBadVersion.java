package io.stricte.leetcode;

// https://leetcode.com/problems/first-bad-version/
/*
Runtime: 12 ms, faster than 98.06% of Java online submissions for First Bad Version.
Memory Usage: 36.1 MB, less than 12.20% of Java online submissions for First Bad Version.
*/
public class FirstBadVersion {

  private static int badVersion = 1;

  public int firstBadVersion(int n) {
    int lo = 1, hi = n;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (isBadVersion(mid)) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }
    return lo;
  }

  static void setBadVersion(int version) {
    badVersion = version;
  }

  private static boolean isBadVersion(int version) {
    return version == badVersion;
  }
}
