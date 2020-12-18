package io.stricte.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ExcelSheetColumnTitleTest {

  @Test
  void test() {

    var title = new ExcelSheetColumnTitle();
    assertThat(title.convertToTitle(25)).isEqualTo("Y");
    assertThat(title.convertToTitle(52)).isEqualTo("AZ");
    assertThat(title.convertToTitle(1)).isEqualTo("A");
    assertThat(title.convertToTitle(2)).isEqualTo("B");
    assertThat(title.convertToTitle(3)).isEqualTo("C");
    assertThat(title.convertToTitle(28)).isEqualTo("AB");
    assertThat(title.convertToTitle(701)).isEqualTo("ZY");
  }
}