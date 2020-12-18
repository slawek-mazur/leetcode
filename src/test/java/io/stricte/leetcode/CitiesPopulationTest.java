package io.stricte.leetcode;

import java.util.Map;
import org.junit.jupiter.api.Test;

class CitiesPopulationTest {

  @Test
  void test() {

    CitiesPopulation cities = new CitiesPopulation(Map.of("NY", 3, "LA", 3, "CHI", 3));

    System.out.println(cities.pickIndex());
    System.out.println(cities.pickIndex());
    System.out.println(cities.pickIndex());
    System.out.println(cities.pickIndex());
  }
}