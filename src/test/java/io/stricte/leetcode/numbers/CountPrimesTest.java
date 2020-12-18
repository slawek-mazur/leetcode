package io.stricte.leetcode.numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CountPrimesTest {

  @Test
  void test() {
    var primes = new CountPrimes();
    assertThat(primes.countPrimes(10)).isEqualTo(4);
    assertThat(primes.countPrimes(20)).isEqualTo(8);
    assertThat(primes.countPrimes(100)).isEqualTo(25);
    assertThat(primes.countPrimes(200)).isEqualTo(46);
  }
}