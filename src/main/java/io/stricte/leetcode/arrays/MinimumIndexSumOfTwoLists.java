package io.stricte.leetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// https://leetcode.com/problems/minimum-index-sum-of-two-lists/
/*
Runtime: 10 ms, faster than 45.51% of Java online submissions for Minimum Index Sum of Two Lists.
Memory Usage: 39.9 MB, less than 45.29% of Java online submissions for Minimum Index Sum of Two Lists.
*/
public class MinimumIndexSumOfTwoLists {

  public String[] findRestaurant(String[] list1, String[] list2) {

    Map<String, Integer> idx = new HashMap<>();
    for (int i = 0; i < list1.length; i++) {
      idx.put(list1[i], i);
    }

    SortedMap<Integer, Set<String>> map = new TreeMap<>();
    for (int i = 0; i < list2.length; i++) {
      String el = list2[i];
      if (idx.containsKey(el)) {
        int index = i + idx.get(el);
        if (map.containsKey(index)) {
          map.get(index).add(el);

        } else {
          Set<String> elems = new HashSet<>();
          elems.add(el);
          map.put(index, elems);
        }
      }
    }
    return map.get(map.firstKey()).toArray(new String[0]);
  }
}
