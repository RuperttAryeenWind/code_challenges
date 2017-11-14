package com.ruperttwind.datastructure.queue;



/**
 * Created by ruperttwind on 10/06/17.
 */
public class Queue<E> {

    private Node<E> head;

    private Node<E> tail;

    private Long size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0l;
    }

    public void add(E value) {

        Node<E> node = new Node<E>(tail, value, null);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setAfter(node);
            tail = node;
        }

        size = size + 1;
        return;
    }

    public Boolean remove() {
        if (size == 0) return null;

        head = head.getAfter();

        size = size - 1;
        return true;
    }

    public E peep() {
        return head.getValue();
    }

    public Long size() {
        return size;
    }

    public void reset() {
        head = null;
        tail = null;
        size = 0l;
    }

    static class Node<E> {

        private E value;
        private Node<E> before;
        private Node<E> after;

        Node(final Node<E> before, final E value, final Node<E> after) {
            this.value = value;
            this.after = after;
            this.before = before;
        }

        Node<E> getAfter() { return this.after; }

        Node<E> getBefore() { return this.before; }

        E getValue() { return this.value; }

        void setAfter(Node<E> element) { this.after = element; }

        void setBefore(Node<E> element) { this.before = element; }

        void setValue(E value) { this.value = value; }
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
