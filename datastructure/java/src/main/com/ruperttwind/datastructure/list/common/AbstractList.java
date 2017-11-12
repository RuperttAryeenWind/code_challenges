package com.ruperttwind.datastructure.list.common;

public abstract class AbstractList<E> implements List<E> {

  public Integer size() {
    throw new UnsupportedOperationException();
  }

  public Boolean isEmpty() {
    throw new UnsupportedOperationException();
  }

  public Boolean add(final E value) {
    throw new UnsupportedOperationException();
  }

  public Boolean remove(final Integer index) {
    throw new UnsupportedOperationException();
  }

  public Boolean remove(final E value) {
    throw new UnsupportedOperationException();
  }

  public E get(final Integer index) {
    throw new UnsupportedOperationException();
  }

  public Boolean set(final Integer index, final E element) {
    throw new UnsupportedOperationException();
  }

  public Boolean delete(final Integer index) {
    throw new UnsupportedOperationException();
  }

  public Boolean deleteAll(final List<Integer> indices) {
    throw new UnsupportedOperationException();
  }
}
