package io.stricte.leetcode;

// https://leetcode.com/problems/distance-between-bus-stops/
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Distance Between Bus Stops.
Memory Usage: 39.1 MB, less than 26.79% of Java online submissions for Distance Between Bus Stops.
*/
public class DistanceBetweenBusStops {

  public int distanceBetweenBusStops(int[] distance, int start, int destination) {
    if (1 == distance.length) {
      return 0;
    }

    int from, to;
    if (start <= destination) {
      from = start;
      to = destination;
    } else {
      from = destination;
      to = start;
    }
    int total = 0, between = 0;
    for (int value : distance) {
      total += value;
    }
    for (int i = from; i < to; i++) {
      between += distance[i];
    }
    return Math.min(between, total - between);
  }
}
