package com.ruperttwind.datastructure.queue;

import com.ruperttwind.datastructure.common.Node;

/**
 * Created by ruperttwind on 10/06/17.
 */
public class Queue<T> {

    private Node<T> head;

    private Node<T> tail;

    private Long size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0l;
    }

    public void add(T data) {

        Node node = new Node(data, tail, null);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setBehind(node);
            tail = node;
        }

        size = size + 1;
        return;
    }

    public T remove() {
        if (size == 0) return null;

        T data = head.getData();
        head = head.getBehind();

        size = size - 1;
        return data;
    }

    public T peep() {
        return head.getData();
    }

    public Long size() {
        return size;
    }

    public void reset() {
        head = null;
        tail = null;
        size = 0l;
    }

    public static void main(String[] Args) {

        Queue<Integer> queue = new Queue<>();

        queue.add(1);
        System.out.println(queue.peep());
        queue.add(2);
        System.out.println(queue.peep());
        System.out.println(queue.remove());
        System.out.println(queue.peep());
        System.out.println(queue.remove());
    }
}
