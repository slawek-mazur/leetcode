package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {

    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    backtrack(res, new ArrayList<>(), candidates, target, 0);
    return res;
  }

  private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
    if (remain == 0) {
      list.add(new ArrayList<>(tempList));

    } else if (remain > 0) {
      for (int i = start; i < nums.length; i++) {
        if (i > start && nums[i] == nums[i - 1]) {
          continue; // skip duplicates
        }
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, remain - nums[i], i + 1);
        tempList.remove(tempList.size() - 1);
      }
    }
  }
}
