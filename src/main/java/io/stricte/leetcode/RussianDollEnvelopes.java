package io.stricte.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes {

  public int maxEnvelopes(int[][] envelopes) {
    if (null == envelopes || 0 == envelopes.length) {
      return 0;
    }

    Arrays.sort(envelopes, Comparator.comparingInt(o -> o[0]));

    int sum = 0;
    int[] pop = envelopes[0];
    for (int i = 1; i < envelopes.length; i++) {
      if (pop[0] < envelopes[i][0] && pop[1] < envelopes[i][1]) {
        sum++;
      }
      pop = envelopes[i];
    }
    return sum;
  }
}
