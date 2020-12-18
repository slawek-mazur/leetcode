package io.stricte.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ValidateIpAddressTest {

  @Test
  void test() {

    System.out.println(Arrays.toString("2001:db8:85a3:0:8a2E:8a2E:7334:".split(":")));
    System.out.println(Arrays.toString("2001:db8:85a3:0:8a2E:8a2E:7334:".split(":", -1)));
  }
}