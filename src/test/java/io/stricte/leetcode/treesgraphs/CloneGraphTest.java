package io.stricte.leetcode.treesgraphs;

import io.stricte.leetcode.treesgraphs.CloneGraph.Node;
import java.util.Deque;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class CloneGraphTest {

  @Test
  void test() {

    Deque<Integer> ints = new LinkedList<>();
    ints.add(1);
    ints.add(2);
    ints.add(3);
    ints.add(4);

    //System.out.println(ints);

    Integer poll = ints.poll();
    Integer pop = ints.pop();

    //System.out.println(ints);

    CloneGraph cloneGraph = new CloneGraph();

    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(4);

    one.neighbors.add(two);
    one.neighbors.add(four);

    two.neighbors.add(one);
    two.neighbors.add(three);

    three.neighbors.add(two);
    three.neighbors.add(four);

    four.neighbors.add(one);
    four.neighbors.add(three);

    System.out.println(cloneGraph.cloneGraph(one));
  }
}