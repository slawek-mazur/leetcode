package io.stricte.leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

class WordBreakIITest {

  @Test
  void test() {

    WordBreakII breakIt = new WordBreakII();

    /*
    System.out.println(breakIt.wordBreak(
      "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
      List.of("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"))
    );
    */

    System.out.println(breakIt.wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog")));

    /*
    System.out.println(breakIt.wordBreak("pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple")));

    System.out.println(breakIt.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    */
  }
}