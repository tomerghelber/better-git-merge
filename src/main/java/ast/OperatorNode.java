package com.github.tomerghelber.ast;

public class OperatorNode implements ASTNode  {
    public Variable variable;
    public Node value;
    public Operator operator;

    public static enum Operator {
        Assign,
    }
}
