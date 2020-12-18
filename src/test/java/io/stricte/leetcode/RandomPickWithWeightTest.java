package io.stricte.leetcode;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class RandomPickWithWeightTest {

  @Test
  void test() {

    RandomPickWithWeight pick = new RandomPickWithWeight(new int[]{1, 3});

    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < 1000; i++) {
      int index = pick.pickIndex();
      m.merge(index, 1, Integer::sum);
    }
    System.out.println(m);
  }
}