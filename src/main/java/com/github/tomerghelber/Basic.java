package com.github.tomerghelber;

import com.github.tomerghelber.ast.Variable;

/**
 * Main class.
 */
public class Basic {
    public static boolean isRename(Variable first, Variable second) {
        return first.getIdentifier() == second.getIdentifier();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
