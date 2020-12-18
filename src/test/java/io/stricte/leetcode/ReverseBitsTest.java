package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

  @Test
  void test() {

    var bits = new ReverseBits();

    String string = Integer.toBinaryString(1234);
    assertThat(bits.reverseBits(1234)).isEqualTo(1260388352);

    //00000010100101000001111010011100
    //00111001011110000010100101000000
    assertThat(bits.reverseBits(43261596)).isEqualTo(964176192);
  }
}