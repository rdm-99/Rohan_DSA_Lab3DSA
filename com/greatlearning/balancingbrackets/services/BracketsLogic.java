package com.greatlearning.balancingbrackets.services;

import java.util.*;

public class BracketsLogic {
    public static String isBalanced(String input) {
        if (input == null || input.isEmpty()) {
            return "Empty string!!";
        }

        Stack<Character> s = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    return "The entered Strings do not contain Balanced Brackets";
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return "The entered Strings do not contain Balanced Brackets";
                }
            } else {
                return "String other than brackets found- Enter only pattern of Brackets!!";
            }
        }
        return s.isEmpty() ? "The entered String has Balanced Brackets" : "The entered Strings do not contain Balanced Brackets";
    }
}
