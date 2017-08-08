package com.ruperttwind.datastructure.common;

import java.util.ArrayList;

/**
 * Created by ruperttwind on 12/06/17.
 */
public class TreeNode<T, Integer> {

    private T data;

    private Integer branching;

    private TreeNode<T, Integer> parent;

    private ArrayList<TreeNode<T, Integer>> leaves;

    public TreeNode(T data, ArrayList<TreeNode<T, Integer>> leaves) throws Exception {
        this.data = data;
        this.leaves = leaves;

        if (leaves.size() > (int) branching) throw new Exception("Size exceeded branching limit for tree");
    }
}
