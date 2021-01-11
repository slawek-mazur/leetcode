package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FindSmallestLetterGreaterThanTargetTest {

  @Test
  void test() {

    var target = new FindSmallestLetterGreaterThanTarget();
    assertThat(target.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a')).isEqualTo('c');
    assertThat(target.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c')).isEqualTo('f');
    assertThat(target.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd')).isEqualTo('f');
    assertThat(target.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g')).isEqualTo('j');
    assertThat(target.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j')).isEqualTo('c');
    assertThat(target.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k')).isEqualTo('c');
    assertThat(target.nextGreatestLetter(new char[]{'a', 'b'}, 'z')).isEqualTo('a');
  }
}