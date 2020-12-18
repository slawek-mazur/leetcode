package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
/*
Runtime: 2 ms, faster than 97.59% of Java online submissions for X of a Kind in a Deck of Cards.
Memory Usage: 39.4 MB, less than 30.87% of Java online submissions for X of a Kind in a Deck of Cards.
*/
public class XKindInDeckOfCard {

  public boolean hasGroupsSizeX(int[] deck) {

    int[] groups = new int[10_000];
    for (int d : deck) {
      ++groups[d];
    }
    int min = Integer.MAX_VALUE;
    for (int group : groups) {
      if (group > 0) {
        min = Math.min(min, group);
      }
    }
    if (min < 2) {
      return false;
    }
    loop:
    for (int i = 2; i < 10_000; i++) {
      for (int group : groups) {
        if (group != 0 && group % i != 0) {
          continue loop;
        }
      }
      return true;
    }
    return false;
  }
}
