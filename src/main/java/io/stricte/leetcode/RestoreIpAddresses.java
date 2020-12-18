package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {

  private List<String> res;

  public List<String> restoreIpAddresses(String s) {
    res = new ArrayList<>();
    if (null == s || s.trim().length() < 4) {
      return res;
    }

    int[] nums = new int[s.length()];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = s.charAt(i) - '0';
    }

    helper(0, 1, nums, "");

    return res;
  }

  private void helper(int start, int block, int[] nums, String ip) {

    //System.out.println(String.format("ip=%s", ip));

    int n = nums.length;

    if (5 == block && start == n) {
      res.add(ip);
      return;
    }

    if (block > 4 || start >= n) {
      return;
    }

    String sep = ip.isEmpty() ? "" : ".";

    int a = nums[start];
    helper(start + 1, block + 1, nums, ip + sep + a);
    if (0 != a && start + 1 < n) {
      int b = a * 10 + nums[start + 1];
      helper(start + 2, block + 1, nums, ip + sep + b);

      if (start + 2 < n) {
        int c = b * 10 + nums[start + 2];
        if (c < 256) {
          helper(start + 3, block + 1, nums, ip + sep + c);
        }
      }
    }
  }
}
