package io.stricte.leetcode.arrays;

// https://leetcode.com/problems/can-place-flowers/
/*
Runtime: 1 ms, faster than 91.88% of Java online submissions for Can Place Flowers.
Memory Usage: 40.2 MB, less than 85.11% of Java online submissions for Can Place Flowers.

Time: O(N)
Space: O(1)
*/
public class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {

    int count = 1;
    int result = 0;
    for (int value : flowerbed) {
      if (value == 0) {
        count++;
      } else {
        result += (count - 1) / 2;
        count = 0;
      }
    }
    if (count != 0) {
      result += count / 2;
    }
    return result >= n;

    /*
    for (int i = 0, m = flowerbed.length; i < m && n > 0; i++) {
      if (0 == flowerbed[i]) {
        if (((i - 1 >= 0 && flowerbed[i - 1] == 0) || i == 0) &&
          ((i + 1 < m && flowerbed[i + 1] == 0) || i == m - 1)) {
          flowerbed[i] = 1;
          n--;
        }
      }
    }
    return 0 == n;
    */
  }
}
