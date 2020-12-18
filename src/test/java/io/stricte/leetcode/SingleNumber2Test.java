package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SingleNumber2Test {

  @Test
  void test() {

    int y = 0;
    System.out.println(Integer.toBinaryString(y));
    System.out.println(Integer.toBinaryString(~y));
    System.out.println(Integer.toBinaryString(y | ~y));


    SingleNumber2 number2 = new SingleNumber2();
    assertThat(number2.singleNumber(new int[]{2, 2, 3, 2})).isEqualTo(3);
    //assertThat(number2.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99})).isEqualTo(99);

  }
}