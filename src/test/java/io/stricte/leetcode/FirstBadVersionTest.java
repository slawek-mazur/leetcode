package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FirstBadVersionTest {

  @Test
  void test() {

    var version = new FirstBadVersion();
    FirstBadVersion.setBadVersion(2);
    assertThat(version.firstBadVersion(2)).isEqualTo(2);

    FirstBadVersion.setBadVersion(4);
    assertThat(version.firstBadVersion(5)).isEqualTo(4);

    FirstBadVersion.setBadVersion(1);
    assertThat(version.firstBadVersion(1)).isEqualTo(1);
  }
}