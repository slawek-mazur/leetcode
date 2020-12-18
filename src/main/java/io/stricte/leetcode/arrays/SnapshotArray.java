package io.stricte.leetcode.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

// https://leetcode.com/problems/snapshot-array/
public class SnapshotArray {

  private final Map<Integer, Map<Integer, Integer>> map;

  private int snap = 0;

  public SnapshotArray(int length) {
    map = new HashMap<>();
  }

  public void set(int index, int val) {
    if (map.containsKey(index)) {
      Map<Integer, Integer> versions = map.get(index);
      versions.put(snap, val);

    } else {
      Map<Integer, Integer> versions = new LinkedHashMap<>();
      versions.put(snap, val);
      map.put(index, versions);
    }
  }

  public int snap() {
    return snap++;
  }

  public int get(int index, int snap_id) {
    if (0 == snap) {
      throw new IllegalStateException("No snapshots");
    }
    if (map.containsKey(index)) {
      Map<Integer, Integer> versions = map.get(index);
      if (versions.containsKey(snap_id)) {
        return versions.get(snap_id);
      }
      int fallback = versions.getOrDefault(0, 0);
      for (Entry<Integer, Integer> e : versions.entrySet()) {
        if (e.getKey() < snap_id) {
          fallback = e.getValue();
        }
      }
      return fallback;
    }
    return 0;
  }
}
