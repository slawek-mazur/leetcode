package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ExcelSheetColumnNumberTest {

  @Test
  void test() {

    var number = new ExcelSheetColumnNumber();
    assertThat(number.titleToNumber("A")).isEqualTo(1);
    assertThat(number.titleToNumber("B")).isEqualTo(2);
    assertThat(number.titleToNumber("C")).isEqualTo(3);
    assertThat(number.titleToNumber("Z")).isEqualTo(26);
    assertThat(number.titleToNumber("AA")).isEqualTo(27);
    assertThat(number.titleToNumber("AB")).isEqualTo(28);
    assertThat(number.titleToNumber("ZY")).isEqualTo(701);
    assertThat(number.titleToNumber("AAZ")).isEqualTo(728);
    assertThat(number.titleToNumber("AAD")).isEqualTo(706);
  }
}