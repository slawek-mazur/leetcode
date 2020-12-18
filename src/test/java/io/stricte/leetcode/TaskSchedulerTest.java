package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class TaskSchedulerTest {

  @Test
  void test() {

    var scheduler = new TaskScheduler();

    assertThat(scheduler.leastInterval(new char[]{
      'A', 'A', 'A',
      'B', 'B', 'B',
      'C', 'C', 'C',
      'D', 'D', 'D'
    }, 2)).isEqualTo(4);

    assertThat(scheduler.leastInterval(new char[]{
      'A', 'A',
      'B', 'B',
      'C', 'C',
      'D', 'D',
      'E', 'E',
      'F', 'F',
      'G', 'G',
      'H', 'H',
      'I', 'I',
      'J', 'J',
      'K', 'K',
      'L', 'L'
    }, 4)).isEqualTo(24);

    assertThat(scheduler.leastInterval(new char[]{'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'}, 4)).isEqualTo(10);
    assertThat(scheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2)).isEqualTo(8);
    assertThat(scheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0)).isEqualTo(6);
    assertThat(scheduler.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2)).isEqualTo(16);
  }
}