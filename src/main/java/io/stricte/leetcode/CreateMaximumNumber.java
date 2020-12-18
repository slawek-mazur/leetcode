package io.stricte.leetcode;

// ->> https://leetcode.com/problems/create-maximum-number/
public class CreateMaximumNumber {

  public int[] maxNumber(int[] nums1, int[] nums2, int k) {

    if (null == nums1 || 0 == nums1.length) {
      int[] res = new int[k];
      System.arraycopy(nums2, 0, res, 0, k);
      return res;
    }

    if (null == nums2 || 0 == nums2.length) {
      int[] res = new int[k];
      System.arraycopy(nums1, 0, res, 0, k);
      return res;
    }

    int[] res = new int[k];

    int p1 = 0, p2 = 0;

    return res;
  }
}
