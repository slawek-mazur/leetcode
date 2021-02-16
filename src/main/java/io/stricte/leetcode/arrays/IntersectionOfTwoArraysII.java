package io.stricte.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
/*
Runtime: 4 ms, faster than 32.92% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 39.1 MB, less than 80.53% of Java online submissions for Intersection of Two Arrays II.
*/
public class IntersectionOfTwoArraysII {

  public int[] intersect(int[] nums1, int[] nums2) {
    if (null == nums1 || 0 == nums1.length ||
      null == nums2 || 0 == nums2.length) {

      return new int[0];
    }

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    var res = new ArrayList<Integer>();
    int i = 0, j = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        res.add(nums1[i]);
        i++;
        j++;

      } else if (nums1[i] < nums2[j]) {
        while (i < nums1.length && nums1[i] < nums2[j]) {
          i++;
        }

      } else {
        while (j < nums2.length && nums2[j] < nums1[i]) {
          j++;
        }
      }
    }
    return res.stream().mapToInt(Integer::intValue).toArray();
  }
}
