package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses
public class GenerateParentheses {

  private List<String> res;

  public List<String> generateParenthesis(int n) {
    res = new ArrayList<>();
    if (n < 1) {
      return res;
    }

    helper("(", 1, 0, n);

    return res;
  }

  private void helper(String s, int opened, int closed, int n) {
    if (n == opened && n == closed) {
      res.add(s);
      return;
    }
    if (opened > closed) {
      helper(s + ")", opened, closed + 1, n);
    }
    if (opened < n) {
      helper(s + "(", opened + 1, closed, n);
    }
  }
}
