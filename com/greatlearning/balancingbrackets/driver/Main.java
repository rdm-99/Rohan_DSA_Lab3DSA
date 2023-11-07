package com.greatlearning.balancingbrackets.driver;

import com.greatlearning.balancingbrackets.services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a pattern of brackets: ");
        String inp = sc.nextLine();
        System.out.println(BracketsLogic.isBalanced(inp));
        sc.close();
    }
}
