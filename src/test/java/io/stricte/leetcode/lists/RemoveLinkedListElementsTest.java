package io.stricte.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;
import io.stricte.leetcode.lists.RemoveLinkedListElements.ListNode;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElementsTest {

  @Test
  void test() {

    var elements = new RemoveLinkedListElements();

    ListNode node1 = new ListNode(1,
      new ListNode(2,
        new ListNode(6,
          new ListNode(3,
            new ListNode(4,
              new ListNode(5,
                new ListNode(6)
              )
            )
          )
        )
      )
    );
    assertThat(elements.removeElements(node1, 6).toString()).isEqualTo("1->2->3->4->5");

    ListNode node2 = new ListNode(5,
      new ListNode(5,
        new ListNode(5,
          new ListNode(5,
            new ListNode(5,
              new ListNode(5,
                new ListNode(5)
              )
            )
          )
        )
      )
    );
    assertThat(elements.removeElements(node2, 5)).isNull();
  }
}