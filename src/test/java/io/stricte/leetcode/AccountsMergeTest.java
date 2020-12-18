package io.stricte.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class AccountsMergeTest {

  @Test
  void test() {

    var merge = new AccountsMerge();

    /*
    List<List<String>> input = List.of(
      List.of("John", "johnsmith@mail.com", "john00@mail.com"),
      List.of("John", "johnnybravo@mail.com"),
      List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
      List.of("Mary", "mary@mail.com")
    );

    [["David","David0@m.co","David1@m.co"],
    ["David","David3@m.co","David4@m.co"],
    ["David","David4@m.co","David5@m.co"],
    ["David","David2@m.co","David3@m.co"],
    ["David","David1@m.co","David2@m.co"]]
     */
    List<List<String>> input = List.of(
      List.of("David", "David0@m.co", "David1@m.co"),
      List.of("David", "David3@m.co", "David4@m.co"),
      List.of("David", "David4@m.co", "David5@m.co"),
      List.of("David", "David2@m.co", "David3@m.co"),
      List.of("David", "David1@m.co", "David2@m.co")
    );

    assertThat(merge.accountsMerge(input)).containsExactlyInAnyOrder(
      List.of("David", "David0@m.co", "David1@m.co", "David2@m.co", "David3@m.co", "David4@m.co", "David5@m.co")
    );
  }
}