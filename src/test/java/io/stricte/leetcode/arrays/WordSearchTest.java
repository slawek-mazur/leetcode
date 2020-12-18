package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class WordSearchTest {

  @Test
  void test() {

    var search = new WordSearch();

    assertThat(search.exist(new char[][]{
      {'A', 'B', 'C', 'E'},
      {'S', 'F', 'E', 'S'},
      {'A', 'D', 'E', 'E'},
    }, "ABCEFSADEESE")).isTrue();

    assertThat(search.exist(new char[][]{
      {'A', 'B', 'C', 'E'},
      {'S', 'F', 'C', 'S'},
      {'A', 'D', 'E', 'E'},
    }, "ABCCED")).isTrue();

    assertThat(search.exist(new char[][]{
      {'A', 'B', 'C', 'E'},
      {'S', 'F', 'C', 'S'},
      {'A', 'D', 'E', 'E'},
    }, "SEE")).isTrue();

    assertThat(search.exist(new char[][]{
      {'A', 'B', 'C', 'E'},
      {'S', 'F', 'C', 'S'},
      {'A', 'D', 'E', 'E'},
    }, "ABCB")).isFalse();
  }
}