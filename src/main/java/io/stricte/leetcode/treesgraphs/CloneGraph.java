package io.stricte.leetcode.treesgraphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CloneGraph {

  public Node cloneGraph(Node node) {
    if (null == node) {
      return null;
    }

    Map<Integer, Node> map = new HashMap<>();
    Deque<Node> queue = new LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {
      Node current = queue.pop();
      map.computeIfAbsent(current.val, Node::new);

      if (null != current.neighbors) {
        for (Node neighbor : current.neighbors) {
          if (!map.containsKey(neighbor.val)) {
            map.put(neighbor.val, new Node(neighbor.val));
            queue.add(neighbor);
          }
          map.get(current.val).neighbors.add(map.get(neighbor.val));
        }
      }
    }
    return map.get(node.val);
  }

  public static class Node {

    public int val;
    public List<Node> neighbors = new ArrayList<>();

    public Node(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      StringBuilder string = new StringBuilder("(v=" + val);
      if (null != neighbors) {
        string.append(", n=")
          .append(neighbors.stream().map(n -> n.val).collect(Collectors.toList()));
      }
      string.append(')');

      return string.toString();
    }
  }
}
