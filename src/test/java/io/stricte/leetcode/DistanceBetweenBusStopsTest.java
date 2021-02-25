package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class DistanceBetweenBusStopsTest {

  @Test
  void test() {

    var stops = new DistanceBetweenBusStops();
    assertThat(stops.distanceBetweenBusStops(new int[]{10}, 1, 3)).isEqualTo(0);
    assertThat(stops.distanceBetweenBusStops(new int[]{5, 20, 30, 40, 1}, 1, 3)).isEqualTo(46);
    assertThat(stops.distanceBetweenBusStops(new int[]{10, 20, 30, 40, 50}, 1, 3)).isEqualTo(50);
    assertThat(stops.distanceBetweenBusStops(new int[]{10, 20, 30, 40, 50}, 3, 1)).isEqualTo(50);
  }
}