package com.ruperttwind.solution;


import com.ruperttwind.datastructure.stack.Stack;

/**
 * Created by ruperttwind on 10/06/17.
 */
public class TowerOfHanoi {


    public static void main(String[] args) {

        Integer numberOfDisks = 3;

        Stack<Integer> source = new Stack<>();
        for (int i = numberOfDisks; i > 0; i--) source.push(i);

        Stack target = new Stack<Integer>();
        Stack auxiliary = new Stack<Integer>();
        move(numberOfDisks, source, target, auxiliary);

        for (int i = numberOfDisks; i > 0; i--) System.out.println(target.pop());
    }


    public static void move(final int n, Stack source, Stack target, Stack auxiliary) {

        // When there is only one disc to be moved, return.
        if (n == 0) return;

        move(n - 1, source, auxiliary, target);

        target.push(source.pop());

        move(n - 1, auxiliary, target, source);
    }
}
