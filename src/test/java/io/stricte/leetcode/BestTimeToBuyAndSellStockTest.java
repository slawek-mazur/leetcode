package io.stricte.leetcode;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

  @Test
  void test() {

    BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
    System.out.println(stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    System.out.println(stock.maxProfit(new int[]{7, 6, 4, 3, 1}));
  }
}