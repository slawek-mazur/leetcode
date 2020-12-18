package io.stricte.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SnapshotArrayTest {

  @Test
  void test() {

    var array = new SnapshotArray(5);
    array.set(0, 5);  // Set array[0] = 5
    assertThat(array.snap()).isEqualTo(0);  // Take a snapshot, return snap_id = 0
    array.set(0, 6);
    assertThat(array.get(0, 0)).isEqualTo(5); // Get the value of array[0] with snap_id = 0, return 5
  }

  @Test
  void testSnap() {

    var array2 = new SnapshotArray(1);
    array2.set(0, 15);
    array2.snap();
    array2.snap();
    array2.snap();
    assertThat(array2.get(0, 2)).isEqualTo(15);
    array2.snap();
    array2.snap();
    assertThat(array2.get(0, 0)).isEqualTo(15);
  }
}