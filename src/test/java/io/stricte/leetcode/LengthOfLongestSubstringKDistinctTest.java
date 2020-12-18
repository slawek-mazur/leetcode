package io.stricte.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LengthOfLongestSubstringKDistinctTest {

  @Test
  void test() {

    LengthOfLongestSubstringKDistinct length = new LengthOfLongestSubstringKDistinct();

    assertEquals(length.lengthOfLongestSubstringKDistinct("bacc", 2), 3);
    assertEquals(length.lengthOfLongestSubstringKDistinct("cdaba", 3), 4);
  }
}