package io.stricte.leetcode;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class CitiesPopulation {

  private static final Random R = new Random();

  private final String[] cities;

  public CitiesPopulation(Map<String, Integer> map) {
    int n = 0;
    for (Entry<String, Integer> e : map.entrySet()) {
      n += e.getValue();
    }
    cities = new String[n];
    int i = 0;
    for (Entry<String, Integer> e : map.entrySet()) {
      for (int j = 0; j < e.getValue(); j++) {
        cities[i++] = e.getKey();
      }
    }
  }

  public String pickIndex() {
    return cities[R.nextInt(cities.length)];
  }
}
