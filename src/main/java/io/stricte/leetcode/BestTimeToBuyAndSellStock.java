package io.stricte.leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
/*
Runtime: 3 ms, faster than 23.86% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 105.1 MB, less than 7.40% of Java online submissions for Best Time to Buy and Sell Stock.
*/
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    if (null == prices || 0 == prices.length) {
      return 0;
    }

    int max = 0, res = 0;
    int min = prices[0];

    for (int i = 1; i < prices.length; i++) {

      if (prices[i] < min) {
        max = prices[i];
        min = prices[i];
      } else {
        max = Math.max(max, prices[i]);
      }
      res = Math.max(res, prices[i] - min);
    }
    return Math.max(res, 0);
  }
}
