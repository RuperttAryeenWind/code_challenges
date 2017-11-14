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
      Node<E> node = new Node<E>(null, value, start);
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

    // If index is larger than the number of items in the list - throw IndexOutOfBoundsException.
    if (index > size - 1) throw new IndexOutOfBoundsException();

    Node<E> currentNode = start;
    for (int i = 0; i < index; i++) {
      if (i == index) return removeCurrentNode(currentNode);
      currentNode = currentNode.getNext();
    }

    throw new IndexOutOfBoundsException();
  }

  @Override
  public Boolean remove(final E element) {
    throw new UnsupportedOperationException();
  }

  private Boolean removeCurrentNode(final Node<E> currentNode) {
    currentNode.getPrevious().setNext(currentNode.getNext());
    currentNode.getNext().setPrevious(currentNode.getPrevious());
    return true;
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

  static class Node<E> {

    private E value;
    private Node<E> next;
    private Node<E> prev;

    Node(final Node<E> prev, final E value, final Node<E> next) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }

    Node<E> getNext() { return this.next; }

    Node<E> getPrevious() { return this.prev; }

    E getValue() { return this.value; }

    void setNext(Node<E> element) { this.next = element; }

    void setPrevious(Node<E> element) { this.prev = element; }

    void setValue(E value) { this.value = value; }
  }
}
