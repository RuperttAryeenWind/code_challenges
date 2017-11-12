package com.ruperttwind.datastructure.list;

import com.ruperttwind.datastructure.list.common.AbstractList;
import com.ruperttwind.datastructure.list.common.List;


public class LinkedList<E> extends AbstractList<E> implements List<E> {

  @Override
  public Integer size() {
    return super.size();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Boolean add(final E value) {
    return super.add(value);
  }

  @Override
  public Boolean remove(final Integer index) {
    return null;
  }

  @Override
  public Boolean remove(final E e) {
    return null;
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
}
