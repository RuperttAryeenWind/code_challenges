package com.ruperttwind.datastructure.stack;

/**
 * Created by ruperttwind on 10/06/17.
 */
public class Stack<T> {

    private Node<T> top;

    private Long size;

    public Stack() {
        this.top = null;
        this.size = 0l;
    }

    public void push(T data) {
        top = new Node(data, null, top);
        size = size + 1;
    }

    public T peep() {
        return top.getData();
    }

    public T pop() {
        if (size == 0) return null;

        T data = top.getData();
        top = top.getBehind();

        size = size - 1;
        return data;
    }

    public Long size() {
        return size;
    }

    public void reset() {
        top = null;
        size = 0l;
    }
}
