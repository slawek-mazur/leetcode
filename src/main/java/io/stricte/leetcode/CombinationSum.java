package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

  private List<List<Integer>> res;

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    res = new ArrayList<>();
    if (null == candidates || 0 == candidates.length) {
      return res;
    }

    helper(candidates, target, new ArrayList<>(), 0);
    return res;
  }

  public void helper(int[] candidates, int target, List<Integer> matches, int start) {
    if (target < 0) {
      System.err.println("[no match]");
      return;
    }

    if (0 == target) {
      System.out.println(String.format("[%d]=%d target=%d matches=%s <<-",
        start, candidates[start], target, matches));
      res.add(matches);
      return;
    }

    for (int i = start; i < candidates.length; i++) {
      System.out.println(String.format("[%d]=%d target=%d matches=%s",
        i, candidates[i], target, matches));

      List<Integer> newMatches = new ArrayList<>(matches);
      newMatches.add(candidates[i]);
      helper(candidates, target - candidates[i], newMatches, i);
    }
  }
}
