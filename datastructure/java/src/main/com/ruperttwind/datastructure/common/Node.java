package com.ruperttwind.datastructure.common;

import lombok.Data;

/**
 * Created by ruperttwind on 11/06/17.
 */
@Data
public class Node<T> {

    private T data;

    private Node<T> before;

    private Node<T> behind;

    public Node() {
        this.data = null;
        this.before = null;
        this.behind = null;
    }

    public Node(T data, Node<T> before, Node<T> behind) {
        this.data = data;
        this.before = before;
        this.behind = behind;
    }
}
