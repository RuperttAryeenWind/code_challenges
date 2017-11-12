package com.ruperttwind.datastructure.list.common;

import com.ruperttwind.datastructure.common.Collections;


public interface List<E> extends Collections<E> {

  /**
   * Returns the number of elements in this list.
   *
   * @return the number of elements in this list
   */
  public Integer size();

  /**
   *
   * @return true if the list is empty.
   */
  public Boolean isEmpty();

  /**
   *
   * @param value
   * @return true if the element was successfully added.
   */
  public Boolean add(final E value);

  /**
   *
   * @param index
   * @return
   */
  public Boolean remove(final Integer index);

  /**
   *
   * @param e
   * @return
   */
  public Boolean remove(final E e);

  /**
   *
   * @param index
   * @return
   */
  public E get(final Integer index);

  /**
   *
   * @param index
   * @param element
   * @return
   */
  public Boolean set(final Integer index, final E element);

  /**
   *
   * @param index
   */
  public Boolean delete(final Integer index);

  /**
   *
   * @param indices
   */
  public Boolean deleteAll(final List<Integer> indices);
}
