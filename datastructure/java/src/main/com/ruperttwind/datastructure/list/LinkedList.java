package com.ruperttwind.datastructure.list;

import com.ruperttwind.datastructure.list.common.AbstractList;
import com.ruperttwind.datastructure.list.common.List;


public class LinkedList<E> extends AbstractList<E> implements List<E> {

  private Node<E> start;

  private Integer size = 0;

  public LinkedList() {
    start = null;
    size = 0;
  }

  @Override
  public Integer size() {
    return super.size();
  }

  @Override
  public Boolean isEmpty() {
    return (size >= 0);
  }

  @Override
  public Boolean add(final E value) {
    try {
      Node<E> node = new Node<E>(start, value, null);
      start = node;
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Removes a node at the index-th position in the list.
   * This is done by making the following manipulations
   * --> previous of next node points to the previous element of the deleted node
   * --> next of previous element points to next of deleted node.
   *
   * Other conditions
   * 1. If the index is greater than the max size
   *
   * @param index
   * @return
   */
  @Override
  public Boolean remove(final Integer index) {
    Node<E> currentNode = start;

    for (int i = 0; i < index; i++) {
      if (currentNode == null) {
        throw new IndexOutOfBoundsException();
      }

      if (i == index) {
        Node<E> _currentNode = currentNode;
        _currentNode.prev.next = currentNode.next;
        _currentNode.next.prev = currentNode.prev;
      }
      currentNode = currentNode.next;
    }
    throw new IndexOutOfBoundsException();
  }

  @Override
  public Boolean remove(final E e) {
    return super.remove(e);
  }

  @Override
  public E get(final Integer index) {
    return null;
  }

  @Override
  public Boolean set(final Integer index, final E element) {
    return null;
  }

  @Override
  public Boolean delete(final Integer index) {
    return false;
  }

  public Boolean deleteAll(final List<Integer> indices) {
    return false;
  }

  @Data
  static class Node<E> {

    private E value;
    private Node<E> next;
    private Node<E> prev;

    Node(final Node<E> prev, final E value, final Node<E> next) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}
