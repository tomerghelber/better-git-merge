package com.github.tomerghelber.ast;

import lombok.Data;

@Data
public class OperatorNode implements ASTNode  {
    private final Variable variable;
    private final ASTNode value;
    private final Operator operator;

    public static enum Operator {
        Assign,
    }
}
