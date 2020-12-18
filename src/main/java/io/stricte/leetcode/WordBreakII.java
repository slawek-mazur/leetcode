package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {

  public List<String> wordBreak(String s, List<String> wordDict) {
    return dsf(s, 0, wordDict, new HashMap<>());
  }

  private static List<String> dsf(String str, int startIndex, List<String> words,
    Map<Integer, List<String>> map) {

    if (map.containsKey(startIndex)) {
      return map.get(startIndex);
    }

    List<String> strs = new ArrayList<>();
    for (String word : words) {
      if (str.startsWith(word, startIndex)) {

        if (str.length() == startIndex + word.length()) {
          strs.add(word);
        } else {
          List<String> strings = dsf(str, startIndex + word.length(), words, map);
          for (String ss : strings) {
            strs.add(word + " " + ss);
          }
        }
      }
    }

    map.put(startIndex, strs);
    return map.get(startIndex);
  }
}
