package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpressionAddOperators {

  public List<String> addOperators(String num, int target) {
    if (num == null || num.isEmpty()) {
      return Collections.emptyList();
    }

    int[] nums = new int[num.length()];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = num.charAt(i) - '0';
    }

    List<String> res = new ArrayList<>();
    helper(nums, 1, nums[0], target, '\0', nums[0] + "", res);

    return res;
  }

  private void helper(int[] nums, int index, int number, int finalNumber, char sign, String view, List<String> res) {
    if (nums.length == index) {
      if (number == finalNumber) {
        res.add(view);
      }
      return;
    }

    helper(nums, index + 1, number + nums[index], finalNumber, '+', view + "+" + nums[index], res);
    helper(nums, index + 1, number - nums[index], finalNumber, '-', view + "-" + nums[index], res);

    if ('*' != sign) {
      if ('+' == sign) {
        int t = number - nums[index - 1];
        helper(nums, index + 1, t + nums[index] * nums[index - 1], finalNumber, '*', view + "*" + nums[index], res);

      } else {
        int t = number + nums[index - 1];
        helper(nums, index + 1, t - nums[index] * nums[index - 1], finalNumber, '*', view + "*" + nums[index], res);
      }
    } else {
      helper(nums, index + 1, number * nums[index], finalNumber, '*', view + "*" + nums[index], res);
    }
  }
}
