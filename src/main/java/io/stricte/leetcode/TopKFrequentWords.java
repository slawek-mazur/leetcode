package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/top-k-frequent-words/
/*
Runtime: 9 ms, faster than 18.38% of Java online submissions for Top K Frequent Words.
Memory Usage: 39.3 MB, less than 55.07% of Java online submissions for Top K Frequent Words.
*/
public class TopKFrequentWords {

  public List<String> topKFrequent(String[] words, int k) {

    var map = Arrays.stream(words)
      .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

    var list = new ArrayList<>(map.keySet());
    list.sort((word1, word2) -> {
      Long f1 = map.get(word1);
      Long f2 = map.get(word2);
      return f1.equals(f2) ? word1.compareTo(word2) : -f1.compareTo(f2);
    });
    return k >= list.size() ? list : list.subList(0, k);
  }
}
