package io.stricte.leetcode;

import lombok.ToString;

@ToString
class MaxStack<T extends Comparable<T>> {

  private Node<T> stack;
  private Node<T> max;

  public void push(T t) {
    if (null == stack) {
      stack = new Node<>();
      stack.value = t;
      max = stack;

    } else {
      Node<T> node = new Node<>();
      node.value = t;
      node.next = stack;
      stack = node;

      if (null != t && t.compareTo(max.value) > 0) {
        node.max = max;
        max = node;
      }
    }
  }

  public T pop() {
    if (null == stack) {
      throw new IllegalStateException("Empty stack");
    }
    Node<T> node = stack;
    stack = node.next;

    if (node.max != null) {
      max = node.max;
    }

    if (null == stack) {
      max = null;
    }

    return node.value;
  }

  public T max() {
    if (null == stack) {
      throw new IllegalStateException("Empty stack");
    }
    return max.value;
  }

  private static class Node<T> {

    private T value;
    private Node<T> next;
    private Node<T> max;

    @Override
    public String toString() {
      return "node(" + "value=" + value + ", next=" + next + ")";
    }
  }
}


public class MaxStackApplication {


  public static void main(String[] args) {

    MaxStack<Integer> maxStack = new MaxStack<>();
    maxStack.push(1);
    maxStack.push(3);
    maxStack.push(-6);
    maxStack.push(99);
    maxStack.push(-32);

    System.out.println(maxStack);
    System.out.println(maxStack.max());
    System.out.println(maxStack.pop());
    System.out.println(maxStack);
    System.out.println(maxStack.max());
    System.out.println(maxStack.pop());
    System.out.println(maxStack);
    System.out.println(maxStack.max());
    System.out.println(maxStack.pop());
    System.out.println(maxStack);
    System.out.println(maxStack.max());
    System.out.println(maxStack.pop());
    System.out.println(maxStack);
    System.out.println(maxStack.max());
    System.out.println(maxStack.pop());
    System.out.println(maxStack);
    System.out.println(maxStack.max());
    System.out.println(maxStack.pop());
  }
}
