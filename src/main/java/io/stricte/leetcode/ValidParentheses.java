package io.stricte.leetcode;

import java.util.ArrayDeque;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

  public boolean isValid(String s) {
    if (null == s || s.isBlank() || 0 != s.length() % 2) {
      return false;
    }

    var chars = s.toCharArray();
    var stack = new ArrayDeque<Character>(s.length() / 2);

    for (char aChar : chars) {
      if (aChar == ')' || aChar == ']' || aChar == '}') {
        if (stack.isEmpty()) {
          return false;
        }
        if ((')' == aChar && '(' == stack.getLast()) ||
          (']' == aChar && '[' == stack.getLast()) ||
          ('}' == aChar && '{' == stack.getLast())) {

          stack.removeLast();

        } else {
          return false;
        }

      } else {
        stack.add(aChar);
      }
    }
    return stack.isEmpty();
  }
}
