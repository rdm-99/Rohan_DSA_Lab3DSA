package com.greatlearning.bst.driver;
import com.greatlearning.bst.services.*;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Tool tree = new Tool();
        tree.root = new Node(40);
        tree.root.left = new Node(20);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(50);
        tree.root.right.right = new Node(70);

        int sum = 130;
        HashSet<Integer> set = new HashSet<>();
        boolean found = tree.findPairWithSum(tree.root, sum, set);

        if (!found) {
            System.out.println("Pair with sum " + sum + " not found.");
        }
    }
}
