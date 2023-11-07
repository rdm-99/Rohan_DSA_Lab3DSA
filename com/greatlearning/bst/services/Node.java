package com.greatlearning.bst.services;

public class Node {
    int data;
    public Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
