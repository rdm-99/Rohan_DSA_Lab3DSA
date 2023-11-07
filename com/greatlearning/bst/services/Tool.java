package com.greatlearning.bst.services;

import java.util.*;

public class Tool {
    public Node root;

    public boolean findPairWithSum(Node root, int sum, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }

        if (findPairWithSum(root.left, sum, set)) {
            return true;
        }

        if (set.contains(sum - root.data)) {
            System.out.println("Pair is (" + (sum - root.data) + "," + root.data + ")");
            return true;
        } else {
            set.add(root.data);
        }

        return findPairWithSum(root.right, sum, set);
    }
}
