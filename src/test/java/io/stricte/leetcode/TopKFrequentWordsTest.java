package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class TopKFrequentWordsTest {

  @Test
  void test() {

    var words = new TopKFrequentWords();
    assertThat(words.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2))
      .containsExactly("i", "love");
    assertThat(words.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4))
      .containsExactly("the", "is", "sunny", "day");
  }
}